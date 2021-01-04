package com.zcloud.issue.util;

import javax.xml.crypto.Data;
import java.util.Date;

public class Random {

    private static final StringBuilder buf = new StringBuilder();

    private static int seq = 0;

    private static final int ROTATION = 99;

    public static String next() {
        if (seq > ROTATION) seq = 0;
        buf.delete(0,buf.length());
        Date date = new Date();

        date.setTime(System.currentTimeMillis());

        return String.format("%1$tY%1$tm%1$td%1$tH%1$tM%1$tS%2$02d",date,seq++);
    }
}

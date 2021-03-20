package com.jaolvv.AOPexercise;

/**
 * Created with IntelliJ IDEA.
 *
 * @Website : https://www.jaolvv.top
 * @Date 3/19/2021 6:07 PM
 * @ClassName PersonService
 * @Author Liu
 * 注释/说明：
 **/

public interface PersonService {
    public void save(String name);
    public void update(String name, int id);
    public String getPersonName(int id);
}

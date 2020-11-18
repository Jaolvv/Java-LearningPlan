package ServlerDemo;

import javax.servlet.*;
import java.io.IOException;

public class ServletTest implements Servlet {
    /*初始化方法
     * 在Servlet被创建时，执行 但只会执行一次*/
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init()执行了......");
        System.out.println("初始化一个Servlet对象，但是这个方法在后续请求中不会在被Servlet容器调用");
    }

    /*获取ServletConfig对象
     * ServletConfig: Servlet的配置对象*/
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /*提供服务方法
     * 每一次Servlet被访问时，执行，执行多次*/
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service()执行了.......");
        System.out.println("每当请求Servlet时，Servlet容器就会调用这个方法");
    }

    //获取一些Servlet的信息，版本，作者等。。。。
    @Override
    public String getServletInfo() {
        return null;
    }

    /*销毁方法
     * 在服务器被正常关闭时，执行，执行一次*/
    @Override
    public void destroy() {
        System.out.println("Servlet将要销毁了.......");
        System.out.println("当要销毁Servlet时，Servlet容器就会调用这个方法");
    }
}

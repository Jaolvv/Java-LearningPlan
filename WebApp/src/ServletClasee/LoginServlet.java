package ServletClasee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        System.err.println(userName+";"+password);
        String myUser = "Liu";
        String myPwd = "123";
        if(userName.equals(myUser)&&password.equals(myPwd)) {
            request.getSession().setAttribute("username",userName);
            response.sendRedirect(request.getContextPath()+"/loginSuccess.jsp?userName="+userName);
        }else {
            request.setAttribute("message", "账密错误，请重新登录<br>");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

    }
}

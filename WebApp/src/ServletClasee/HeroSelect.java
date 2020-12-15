package ServletClasee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/HeroSelect")
public class HeroSelect extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        //获取选择败类的String数组
        String[] bailei = request.getParameterValues("bailei");

        HttpSession session=request.getSession();
        String username = (String)session.getAttribute("userName");
        System.out.println(username);

        request.setAttribute("userName",username);
        request.setAttribute("s" , bailei);
        request.getRequestDispatcher("AfterSelect.jsp").forward(request , response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doPost(request , response);
    }
}


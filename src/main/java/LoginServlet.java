import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        super.doPost(req, resp);
//        if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
//        }
    }
}












//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//@WebServlet(name = "loginServlet" , urlPatterns = "/login" )
//public class loginServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("login.jsp").forward(req, resp);
////        resp.sendRedirect("/login");
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//            String username = req.getParameter("username");
//            String password = req.getParameter("password");
//            if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
//                req.setAttribute("nameuser", username);
//            resp.sendRedirect("/profile.jsp");
//                req.getRequestDispatcher("profile.jsp").forward(req, resp);
//            } else {
//                req.getRequestDispatcher("login.jsp").forward(req, resp);
//            }
//        }
//    }

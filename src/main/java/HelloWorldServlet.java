import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Hello")
public class HelloWorldServlet extends HttpServlet {
    String message;
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();

        message = "Hello World!!";
        out.println("<h1>" + message + "</h1>");

    }

}

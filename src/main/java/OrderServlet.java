import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "orderServlet", urlPatterns = "/orders")
public class OrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(
                "method: "+ req.getMethod()+ "\n"
                + "content path: "+ req.getContextPath()+"\n"
                +"header: " + req.getHeader("application-type"
                ));

    }
}

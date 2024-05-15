import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import org.slf4j.*;

import java.io.IOException;

@WebServlet(name = "testServlet", urlPatterns = "/test")
public class MainServlet implements Servlet {

    private static Logger logger = LoggerFactory.getLogger(MainServlet.class);
    private transient ServletConfig servletConfig;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().println("<h1>yes</h1>");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        logger.info("destroy");
    }
}

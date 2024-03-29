import org.slf4j.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "testServlet", urlPatterns = "/api/")
public class MainServlet implements Servlet {

    private static Logger logger = LoggerFactory.getLogger(MainServlet.class);
    private transient ServletConfig servletConfig;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
        logger.info("gooooo");
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        logger.info("new oer request");
        servletResponse.getWriter().println("jopayes");
        logger.info("was worked");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}

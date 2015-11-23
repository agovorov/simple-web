import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Govorov Andrey
 */
public class MainServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");
        request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
    }
}
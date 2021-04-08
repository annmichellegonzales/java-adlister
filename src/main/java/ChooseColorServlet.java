import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/choose-color")
public class ChooseColorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            String output = "";
            output += "<h1>Enter a color below: </h1>";
            output += "<form action= '/choose-color' method= 'POST'>";
            output += "<input name= 'color' placeholder= 'Color here...'/>";
            output += "</form>";
            out.println(output);
        }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String colorChoice = req.getParameter("color");
        resp.sendRedirect("/view-color?color=" + colorChoice);

    }


    }

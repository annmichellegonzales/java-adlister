import javax.script.ScriptContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
//        out.println("<h2>Hello, World!</h2>");
        Integer count = new Integer(0);
        String head;
        HttpSession session = null;
        if (session.isNew()) {
            head = "This is the New Session";
        } else {
            head = "This is the old Session";
            Integer oldcount =(Integer)session.getValue("count");
            if (oldcount != null) {
                count = new Integer(oldcount.intValue() + 1);
            }
        }
        if (request.getParameter("reset") != null) {

            System.out.println("The value of reset is: ");
            count = 0;

        }

        session.putValue("count", count);
        out.println("<HTML><BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H2 ALIGN=\"CENTER\">" + head + "</H2>\n" +
                "<TABLE BORDER=1 ALIGN=CENTER>\n"
                + "<TR BGCOLOR=\"#FFAD00\">\n"
                +"  <TH>Information Type<TH>Session Count\n"
                +"<TR>\n" +" <TD>Total Session Accesses\n" +
                "<TD>" + count + "\n" +
                "</TABLE>\n"
                +"</BODY></HTML>" );
    }

}

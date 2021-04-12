package model;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@WebServlet("/contacts")
public class ViewContactsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Contact> contacts = Arrays.asList(
                new Contact(1, "Sideshow Bob", "bob@krustytheclownshow.com", "444 Forest Road", "2104444444", new Date(), "img/Sideshow-Bob-Simpsons.jpeg", false),
                new Contact(2, "Sideshow Mel", "mel@krustytheclownshow.com", "333 Tree House Lane", "2103333333", new Date(), "img/sideshowmel.jpeg", false),
                new Contact(3, "Krusty the Clown", "krusty@krustytheclownshow.com", "222 Topeka Ave", "2102222222", new Date(), "img/krusty.jpeg", true)
        );

        request.setAttribute("contacts", contacts);
        request.getRequestDispatcher("contacts.jsp").forward(request, response);
        request.setAttribute("loggedInUser", new User("Krusty the Clown"));
        request.setAttribute("date", new Date());

    }


}

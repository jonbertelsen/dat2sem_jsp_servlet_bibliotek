package dat2;

import dat2.DataMappers.BookMapper;
import dat2.Model.Bog;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "FrontController", urlPatterns = {"/FrontController"})
public class FrontController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String target = request.getParameter("target");
        switch (target){
            case "index": { }; break;
            case "resultater": {
                request.setAttribute("besked", "Nu skal vi vise søgeresultater");
                String titel = request.getParameter("titel");
                String forfatter = request.getParameter("forfatter");
                int udgivelsesaar = Integer.parseInt(request.getParameter("udgivelsesaar"));
                request.setAttribute("titel", titel);
                request.setAttribute("forfatter", forfatter);
                request.setAttribute("udgivelsesaar", udgivelsesaar);
                List<Bog> bogListe = BookMapper.findBooks(titel, forfatter, udgivelsesaar);
                request.setAttribute("bogliste", bogListe);
            }; break;
            default: target = "index";
        }
        request.getServletContext().getRequestDispatcher("/" + target + ".jsp").forward(request, response);
    }
}

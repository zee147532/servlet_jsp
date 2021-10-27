package control;

import dao.DAO;
import entity.Countries;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/showcountries")
public class ShowCountriesServlet extends HttpServlet {

    private DAO servicedao;

    public void init() {
        servicedao = new DAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Countries> list = servicedao.getAllCountries();
        int size = list.size();
        request.setAttribute("listC", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/ShowCountries.jsp");
        dispatcher.forward(request, response);
    }
}

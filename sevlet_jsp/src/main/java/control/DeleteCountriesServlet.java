package control;

import dao.DAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/deletecountries")
public class DeleteCountriesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/DeleteCountries.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String countryID = request.getParameter("countryID");

        DAO.DeleteCountries(countryID);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/DeleteCountries.jsp");
        dispatcher.forward(request, response);
    }
}

package control;

import dao.DAO;
import entity.Countries;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/addcountries")
public class AddCountriesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/AddCountries.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String nationalDay = request.getParameter("nationalDay");
        String countryCode2 = request.getParameter("countryCode2");
        String countryCode3 = request.getParameter("countryCode3");
        String area = request.getParameter("area");

        Countries countries = new Countries();
        countries.setName(name);
        countries.setNationalDay(nationalDay);
        countries.setCountryCode2(countryCode2);
        countries.setCountryCode3(countryCode3);
        countries.setArea(area);

        DAO.AddCountries(countries);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/AddCountries.jsp");
        dispatcher.forward(request, response);
    }
}

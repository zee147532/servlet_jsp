package control;

import dao.DAO;
import entity.Countries;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/updatecountry")
public class UpdateCountryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/UpdateCountries.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String countryID = request.getParameter("countryID");
        String name = request.getParameter("name");
        String nationalDay = request.getParameter("nationalDay");
        String countryCode2 = request.getParameter("countryCode2");
        String countryCode3 = request.getParameter("countryCode3");
        String area = request.getParameter("area");

        Countries countries = new Countries();
        countries.setCountryID(countryID);
        countries.setName(name);
        countries.setNationalDay(nationalDay);
        countries.setCountryCode2(countryCode2);
        countries.setCountryCode3(countryCode3);
        countries.setArea(area);

        DAO.updateCountry(countries);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/UpdateCountries.jsp");
        dispatcher.forward(request, response);
    }
}

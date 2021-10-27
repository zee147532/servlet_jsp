package dao;

import entity.Countries;
import jdbc.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    public static List<Countries> getAllCountries() {
        List<Countries> list = new ArrayList<>();

        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            String sql = "SELECT * FROM countries";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Countries(rs.getString(6), rs.getString(1),
                        rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5)));
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void updateCountry(Countries countries) {
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            String SQL = "UPDATE countries SET NAME = ?, national_day = ?, country_code2 = ?, " +
                    "country_code3 = ?, area = ? WHERE country_id = ?;";
            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setString(1, countries.name);
            ps.setString(2, countries.nationalDay);
            ps.setString(3, countries.countryCode2);
            ps.setString(4, countries.countryCode3);
            ps.setString(5, countries.area);
            ps.setString(6, countries.countryID);
            int rs = ps.executeUpdate();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void AddCountries(Countries countries) {
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            String SQL = "INSERT INTO countries(country_id, name, national_day, country_code2, country_code3, area) "
                    + "VALUES(?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setString(1, countries.countryID);
            ps.setString(2, countries.name);
            ps.setString(3, countries.nationalDay);
            ps.setString(4, countries.countryCode2);
            ps.setString(5, countries.countryCode3);
            ps.setString(6, countries.area);

            int rs = ps.executeUpdate();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void DeleteCountries(String countryID) {
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            String SQL = "DELETE FROM countries WHERE country_id = ?;";
            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setString(1, countryID);

            int rs = ps.executeUpdate();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

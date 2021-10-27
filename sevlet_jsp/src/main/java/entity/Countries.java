package entity;

public class Countries {
    public String countryID;
    public String name;
    public String nationalDay;
    public String countryCode2;
    public String countryCode3;
    public String area;

    public Countries() {
    }

    public Countries(String countryID, String name, String nationalDay,
                     String countryCode2, String countryCode3, String area) {
        this.countryID = countryID;
        this.name = name;
        this.nationalDay = nationalDay;
        this.countryCode2 = countryCode2;
        this.countryCode3 = countryCode3;
        this.area = area;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalDay() {
        return nationalDay;
    }

    public void setNationalDay(String nationalDay) {
        this.nationalDay = nationalDay;
    }

    public String getCountryCode2() {
        return countryCode2;
    }

    public void setCountryCode2(String countryCode2) {
        this.countryCode2 = countryCode2;
    }

    public String getCountryCode3() {
        return countryCode3;
    }

    public void setCountryCode3(String countryCode3) {
        this.countryCode3 = countryCode3;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}

package sax_parser;

public class AdditionalInfo {

    private int sinceYear = 2018;
    private String company = "Company 1";

    public int getSinceYear() {
        return sinceYear;
    }

    public void setSinceYear(int sinceYear) {
        this.sinceYear = sinceYear;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "\nSince year: " + sinceYear + "\nCompany: " + company + "\n";
    }
}

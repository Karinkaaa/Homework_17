package sax_parser;

public class Worker {

    private String login;
    private String position;
    private String company;
    private int sinceYear;

    public Worker() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSinceYear() {
        return sinceYear;
    }

    public void setSinceYear(int sinceYear) {
        this.sinceYear = sinceYear;
    }

    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer("\nWORKER:\n");
        sb.append("Login: ").append(this.login).append("\nPosition: ").append(this.position);
        sb.append("\nCompany: ").append(this.company).append("\nSince year: ").append(this.sinceYear).append("\n");
        return sb.toString();
    }
}

package sax_parser;

public class Worker {

    private String login;
    private String position;
    private AdditionalInfo ai;

    public Worker() {
        ai = new AdditionalInfo();
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

    public AdditionalInfo getAi() {
        return ai;
    }

    public void setAi(AdditionalInfo ai) {
        this.ai = ai;
    }

    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer("\nWORKER:\n");
        sb.append("Login: ").append(this.login).append("\nPosition: ").append(this.position).append(ai);
        return sb.toString();
    }
}

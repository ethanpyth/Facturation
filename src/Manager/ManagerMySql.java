package Manager;

public class ManagerMySql extends Manager{
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String url;
    private String user;
    private String password;

    public ManagerMySql(String user, String password) {
        super("jdbc:mysql://localhost:3306/Facturation", user, password);
        this.url = "jdbc:mysql://localhost:3306/Facturation";
        this.password = password;
        this.user = user;
    }
}

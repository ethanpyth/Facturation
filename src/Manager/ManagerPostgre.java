package Manager;

public class ManagerPostgre extends Manager{
    private String url;
    private String user;

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

    private String password;

    public ManagerPostgre(String user, String password) {
        super("jdbc:postgresql://localhost:5432/postgres", user, password);
        this.url = "jdbc:postgresql://localhost:5432/postgres";
        this.user = user;
        this.password = password;
    }
}

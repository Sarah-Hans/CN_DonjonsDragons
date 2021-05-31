package menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnexion {

    private static DbConnexion instance;
    private static Connection connexion;
    private String url = "jdbc:postgresql://localhost:5432/donjonsdragons";
    private String user = "postgres";
    private String psw = "123Donjons";

    // Constructeur privé
    private DbConnexion() {
        try {
            Class.forName("org.postgresql.Driver");
            connexion = DriverManager.getConnection(url, user, psw);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnexion() {
        return connexion;
    }

    public static DbConnexion getInstance() throws SQLException {
        if (instance == null) {
            instance = new DbConnexion();
        } else if (instance.getConnexion().isClosed()) {
            instance = new DbConnexion();
        }
        return instance;
    }

    public static void setInstance(DbConnexion instance) {
        DbConnexion.instance = instance;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

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

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public String toString() {
        return "DbConnexion{" +
                "connexion=" + connexion +
                ", url='" + url + '\'' +
                ", user='" + user + '\'' +
                ", psw='" + psw + '\'' +
                '}';
    }
}

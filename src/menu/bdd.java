package menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class bdd {
    private Connection conn;
    private Statement stmt;

    public bdd() throws ClassNotFoundException, SQLException {
        //étape 1: charger la classe de driver
        Class.forName("org.postgresql.Driver");
        //étape 2: créer l'objet de connexion
        conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/donjonsdragons","postgres","123Donjons");
        //étape 3: créer l'objet statement
        stmt = conn.createStatement();
    }

    public Connection getConn() {
        return conn;
    }

    public Statement getStmt() {
        return stmt;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }
}

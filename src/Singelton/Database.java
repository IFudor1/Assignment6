package Singelton;
import java.sql.*;
public class Database {
    private static Database instance;
    private Connection con;
    private Database() throws SQLException {
        String connectionurl = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "123456";
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connectionurl, user, password);
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return con;
    }

    public static Database getInstance() throws SQLException {
        if (instance == null) {
            instance = new Database();
        } else if (instance.getConnection().isClosed()) {
            instance = new Database();
        }
        return getInstance();
    }

    public ResultSet query(PreparedStatement query) {
        ResultSet t = null;
        try {
            t = query.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Database query Failed : " + ex.getMessage());
        }
        return t;
    }
    }


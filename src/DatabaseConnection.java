import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection connect() {
        try {
            Class.forName("org.sqlite.JDBC");  // Add this line
            String url = "jdbc:mysql://localhost:3306//databaza.db";
            Connection connection = DriverManager.getConnection(url);
            return connection;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Connection connection = connect();
        if (connection != null) {
            System.out.println("Connected to the database");
            // Perform database operations here
        } else {
            System.out.println("Failed to connect to the database");
        }
    }
}

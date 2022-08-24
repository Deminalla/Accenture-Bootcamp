import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

// don't forget to add sql.jar to library

public class Main {

    public static void createNewDatabase(String fileName) {

        String url = "jdbc:sqlite:C:\\Users\\deniz\\Desktop\\Accenture\\OOP Syntax\\Day 7\\SQL_java\\db\\" + fileName; // db address

        try (Connection conn = DriverManager.getConnection(url)) { // will try to connect to a database
            if (conn != null) { // if it doesn't exist, then will create a new one
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        createNewDatabase("test.db");
    }
}
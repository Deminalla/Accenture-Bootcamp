import java.sql.*;

// don't forget to add sql.jar to library

public class InsertDB {

    public static Connection creat_connect() {

        String url = "jdbc:sqlite:C:\\Users\\deniz\\Desktop\\Accenture\\OOP Syntax\\Day 7\\SQL_java\\db\\test.db"; // db address
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url); // will try to connect to a database, if it doesn't exist, then will create a new one
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void insert(String name, double capacity) {
        String sql = "INSERT INTO warehouses(name,capacity) VALUES(?,?)"; // warehouses is table, name and capacity shows which columns to insert into
        // ? is used as parameters

        try (Connection conn = this.creat_connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name); // setting datatype for each column
            pstmt.setDouble(2, capacity);
            pstmt.executeUpdate(); // basically pushes the changes to the db
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        InsertDB app = new InsertDB();
        // first you have to create a table, I did it in sqlite manually by following https://www.sqlitetutorial.net/sqlite-create-table/
        // insert 3 new rows
        app.insert("Character XP", 6000);
        app.insert("Physical Damage", 2000);
        app.insert("Chests Opened", 1500);

        // id column automatically get incremented because I made id a primary key (uniquely identifies each record in a table)

    }
}

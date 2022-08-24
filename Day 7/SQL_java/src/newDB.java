import java.sql.*;

// don't forget to add sql.jar to library

public class newDB {

    public static String url = "jdbc:sqlite:C:\\Users\\deniz\\Desktop\\Accenture\\OOP Syntax\\Day 7\\SQL_java\\db\\test.db"; // global db address

    public static Connection creat_connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url); // will try to connect to a database, if it doesn't exist, then will create a new one
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn; // returns Connection
    }

    public void createTable() throws SQLException {
        String tableName = "player";
        String column1 = "field";
        String column2 = "capacity";
        String column1Type = "TEXT"; // is this necessary?
        String column2Type = "REAL"; // is this necessary?
        Connection connection = DriverManager.getConnection(url);
        Statement stmt = connection.createStatement();
        String query = "create table " + tableName + " ( " + column1+" " + column1Type +  " , " + column2 +" " + column2Type + " )";
        stmt.executeUpdate(query);
        stmt.close();
    }

    public void insert(String name, double capacity) {
        String sql = "INSERT INTO player(field,capacity) VALUES(?,?)"; // warehouses is table, name and capacity shows which columns to insert into
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

    public static void main(String[] args) throws SQLException {
        newDB app = new newDB();

        app.createTable();

        // inserting 3 rows
        app.insert("Character XP", 6000);
        app.insert("Physical Damage", 2000);
        app.insert("Chests Opened", 1500);

    }
}

package cashierDir.Storage;

import java.sql.*;

public class ConnectionManager {

    private static String url = "jdbc:mysql://localhost:3306/prototypeeop";
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String username = "";
    private static String password = "";
    private static Connection con;
    private static String urlString;

    /*
    Then get the connection in a code as follows:

    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    con = ConnectionManager.getConnection();
    stmt = con.createStatement();
    rs = stmt.executeQuery(sql);
    */

    public static Connection getConnection(){
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(urlString, username, password);
            } catch (SQLException ex) {
                // Kan for eksempel logge feil.
                System.out.println("Failed to create the database connection");
            }
        } catch (ClassNotFoundException ex){
            // Kan for eksempel logge feil.
            System.out.println("Class not found");
        }
        return con;
    }

}

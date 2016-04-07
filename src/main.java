import java.sql.*;

/**
 * Created by a1647881 on 07/04/16.
 */
public class main {
    public static void main (String[] args) throws SQLException, ClassNotFoundException{
        //Get Connection
        Class.forName("com.mysql.jdbc.Driver");

        String dbURL = "jdbc:mysql://localhost:3306/valet";
        String user = "student";
        String pass = "student";
        Connection myConn = DriverManager.getConnection(dbURL, user, pass);

        Statement myStmt = myConn.createStatement();

        ResultSet myRS = myStmt.executeQuery("select * from valet");

        while (myRS.next()) {
            System.out.println("Modelo" + myRS.getString("modelo"));
            System.out.println("Placa" + myRS.getString("placa"));
        }
    }
}

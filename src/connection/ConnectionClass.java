package connection;


import java.sql.*;

public class ConnectionClass {
     Connection connection;

    public void makeConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqlConnection", "root", "ulvi291136");
           /* Statement statement = connection.createStatement();
            //statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");*/
            System.out.println("connected");
        } catch (SQLException e) {
            System.out.println("404 not found");
        }

    }
}

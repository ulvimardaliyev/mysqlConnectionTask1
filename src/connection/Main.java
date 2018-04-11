package connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqlconnect", "root", "ulvi291136");
           /* Statement statement = connection.createStatement();
            //statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");*/
            System.out.println("connected");
        } catch (SQLException e) {
            System.out.println("404 not found");
        }
    }
}

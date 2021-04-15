import java.sql.*;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false",
                    "root",
                    "codeup"
            );
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM ads");
            while(rs.next()){
                System.out.println("rs.getLong(\"id\") = " + rs.getLong("id"));
                System.out.println("rs.getLong(\"user_id\") = " + rs.getLong("user_id"));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
            }

            // INSERT EXAMPLE

            Scanner sc = new Scanner(System.in);
            System.out.println("What's the title?");
            String title = sc.nextLine();
            System.out.println("What's the description?");
            String desc = sc.nextLine();

            String insertQuery = "INSERT INTO ads (user_id, title, description) VALUES(1, '"+title+"', '"+desc+"')";
            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            rs = statement.getGeneratedKeys();
            if (rs.next()) {
                System.out.println("Inserted a new record! New id: " + rs.getLong(1));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
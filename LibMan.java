/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libman;

/**
 *
 * @author skhar
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibMan {
    public static void main(String[] args) {
        try {
            Connection connection = DB.connect();
            // Now you can use the connection for SQL queries, updates, etc.

            // Example: Execute a simple query
            String query = "SELECT * FROM login";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query);
                 ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    // Process the result set
                    String column1Value = resultSet.getString("column1");
                    // Process other columns...
                    System.out.println(column1Value);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

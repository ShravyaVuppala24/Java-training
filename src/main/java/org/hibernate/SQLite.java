package org.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class SQLite {
        public static void main(String[] args) {
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;

            try {
                // Connect to the SQLite database
                connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\shrav\\Desktop\\website.db");

                // Create a statement
                statement = connection.createStatement();

                // Execute a query
                resultSet = statement.executeQuery("SELECT * FROM customertable");

                // Process the result set
                while (resultSet.next()) {
                    // Retrieve data from the result set
                    String name = resultSet.getString("name");
                    Integer age = resultSet.getInt("age");
                    Integer phone = resultSet.getInt("phone");


                    // Do something with the data
                    System.out.println("Name: " + name + ", Age: " +age + ", Phone Number: " +phone);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Close the resources
                try {
                    if (resultSet != null) resultSet.close();
                    if (statement != null) statement.close();
                    if (connection != null) connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }



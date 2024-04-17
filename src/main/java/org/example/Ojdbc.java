package org.example;
import java.sql.*;
public class Ojdbc {

    //Java program to set up connection and get all data from table
        public static void main(String arg[])
        {
            Connection connection = null;
            try {
                // below two lines are used for connectivity.
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/db1",
                        "root", "root");

                // mydb is database
                // mydbuser is name of database
                // mydbuser is password of database

                Statement statement;
                statement = connection.createStatement();
                ResultSet resultSet;
                resultSet = statement.executeQuery("select * from customertable");
                while (resultSet.next()) {
                    String name = resultSet.getString("name");
                    Integer age = resultSet.getInt("age");
                    Integer phone = resultSet.getInt("phone");

                    // Do something with the data
                    System.out.println("Name: " + name + ", Age: " +age + ", Phone Number: " +phone);
                }
                resultSet.close();
                statement.close();
                connection.close();
            }
            catch (Exception exception) {
                System.out.println(exception);
            }
        } // function ends
    } // class ends


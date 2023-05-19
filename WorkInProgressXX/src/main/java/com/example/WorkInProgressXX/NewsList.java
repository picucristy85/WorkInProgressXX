package com.example.WorkInProgressXX;

import java.sql.*;

public class NewsList {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/NewsList"; // Specificați URL-ul bazei de date
        String username = "postgres";  // Specificați numele de utilizator al bazei de date
        String password = "postgresql15";  // Specificați parola bazei de date

        try {
            // Încărcarea driverului JDBC
            Class.forName("org.postgresql.Driver");

            // Crearea conexiunii la baza de date
            Connection conn = DriverManager.getConnection(url, username, password);

            // Inserarea datelor în tabele
            Statement statement = conn.createStatement();

            // Inserarea unui publicator
            String publisherQuery = "INSERT INTO publisher (publisher_id, name) VALUES (1, 'Publisher Name')";
            statement.executeUpdate(publisherQuery);

            // Inserarea unui grup de știri
            String newsGroupQuery = "INSERT INTO news_group (news_group_id, name) VALUES (1, 'News Group Name')";
            statement.executeUpdate(newsGroupQuery);

            // Inserarea unei știri
            String newsQuery = "INSERT INTO news (news_id, title, content, published_date, publisher_id, news_group_id) " +
                    "VALUES (1, 'News Title', 'News Content', '2023-05-19', 1, 1)";
            statement.executeUpdate(newsQuery);

            // Închiderea conexiunii la baza de date
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

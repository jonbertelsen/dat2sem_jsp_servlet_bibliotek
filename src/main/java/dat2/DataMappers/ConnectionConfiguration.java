package dat2.DataMappers;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionConfiguration {

    public static Connection getConnection() {

        Connection connection = null;

        String url = "jdbc:mysql://localhost:3306/bibliotek?serverTimezone=CET&useSSL=false";
        String user = "library_user";
        String password = "1234";

        try {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
}
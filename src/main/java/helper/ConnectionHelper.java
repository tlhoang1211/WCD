package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionHelper {
    private static final String DATABASE_URL_FORMAT = "jdbc:mysql://%s:%d/%s?useUnicode=true&characterEncoding=UTF-8";
    private static final String DATABASE_SERVER = "127.0.0.1";
    private static final int DATABASE_HOST = 3306;
    private static final String DATABASE_NAME = "t1908e_sem4";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "";
    private static Connection cnn;

    public static Connection getConnection() {
        try {
            if (cnn == null || cnn.isClosed()) {
                cnn = DriverManager.getConnection(
                        String.format(DATABASE_URL_FORMAT,
                                DATABASE_SERVER,
                                DATABASE_HOST,
                                DATABASE_NAME),
                        DATABASE_USERNAME,
                        DATABASE_PASSWORD);
                System.out.println("Connect Success!");
            }
        } catch (SQLException throwables) {
            System.err.println(throwables.getMessage());
        }
        return cnn;
    }

    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionHelper.getConnection();
        Statement statement = connection.createStatement();
        statement.execute("create table Employee (id int primary key, name varchar(255));");
    }
}

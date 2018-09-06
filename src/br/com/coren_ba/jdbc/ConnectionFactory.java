package br.com.coren_ba.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
private static String URL = "jdbc:sqlserver://192.168.0.142:1433;user=Admin;password=T3st3!!;DabaseName=db_EDocument";

public Connection getConnection() throws SQLException {
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        return DriverManager.getConnection(URL);

    } catch (InstantiationException | IllegalAccessException e) {
        throw new RuntimeException(e);
    } catch (SQLException e) {
        throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    }
}

}
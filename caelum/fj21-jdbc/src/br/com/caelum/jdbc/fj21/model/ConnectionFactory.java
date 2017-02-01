package br.com.caelum.jdbc.fj21.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by manoelferreira on 1/13/17.
 */
public class ConnectionFactory {

    private String drive;
    private String user;
    private String psw;

    public ConnectionFactory() {
        this.drive = "jdbc:mysql://localhost/newbd";
        this.user = "root";
        this.psw = "9114";
    }

    public Connection getConnection() {
        try {

            return DriverManager.getConnection(drive, user, psw);
        } catch (SQLException erro) {
            erro.printStackTrace();
            throw new RuntimeException();
        }
    }

}

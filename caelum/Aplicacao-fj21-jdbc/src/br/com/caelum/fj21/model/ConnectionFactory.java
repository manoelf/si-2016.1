package br.com.caelum.fj21.model;

import exception.DAOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by manoelferreira on 1/13/17.
 */
public class ConnectionFactory {

    private String drive;
    private String user;
    private String password;

    public ConnectionFactory() {
        this.drive = "jdbc:mysql://localhost/fj21";
        this.user = "root";
        this.password = "9114";
    }


    public Connection getConnection() {

        try {

            return DriverManager.getConnection(drive, user, password);

        } catch (SQLException e) {
            e.printStackTrace();
            throw new DAOException("Erros ao tentar conecxão");
        }
    }

}

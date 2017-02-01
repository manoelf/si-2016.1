package br.com.caelum.jdbc.fj21.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by manoelferreira on 1/14/17.
 */
public class ContactDao {


    private Connection connection;

    public ContactDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void insert(Contact contact) {
        PreparedStatement stmt = null;
        String sql = "INSERT INTO contacts" +
                "(name, email, address, bornDate)" +
                "VALUES (?, ?, ?, ?)";

        try {
            stmt = this.connection.prepareStatement(sql);

            stmt.setString(1, contact.getName());
            stmt.setString(2, contact.getEmail());
            stmt.setString(3, contact.getAddress());
            stmt.setDate(4, new Date(contact.getBornDate().getTimeInMillis()));

            stmt.execute();

            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }


    public void remove(Contact contact) {
        PreparedStatement stmt;
        String sql = "DELETE FROM contacts WHERE id=?";

        try {
            stmt = connection.prepareStatement(sql);

            stmt.setLong(1, contact.getId());

            stmt.execute();
            stmt.close();



        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public void update(Contact contact) {
        PreparedStatement stmt = null;
        String sql = "UPDATE contacts SET name=?, email=?, address=? WHERE id=?";

        try {

            stmt = this.connection.prepareStatement(sql);

            stmt.setString(1, contact.getName());
            stmt.setString(2, contact.getEmail());
            stmt.setString(3, contact.getAddress());
            stmt.setLong(4, contact.getId());

            stmt.execute();

            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }
}

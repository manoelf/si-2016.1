package br.com.caelum.fj21.model;

import exception.DAOException;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by manoelferreira on 1/13/17.
 */
public class ContatoDao {



    private Connection connection;

    public ContatoDao() {
        this.connection =  new ConnectionFactory().getConnection();
    }

    public void adiciona(Contato contato) {
        PreparedStatement stmt = null;
        try {

            String sql  = "INSERT INTO contatos" +
                    "(nome, email, endereco, dataNascimento)" +
                    "VALUES (?, ?, ?, ?)";

            stmt = connection.prepareStatement(sql);

            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getEndereco());
            stmt.setDate(4, new Date(Calendar.getInstance().getTimeInMillis()));

            stmt.execute();

            System.out.println("Contato adicionado com sucesso!!!");

            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DAOException("Erros ao inserir contato ao banco de dacos");
        }
    }

    public List<Contato> getContatos() {
        PreparedStatement stmt = null;

        try {
            stmt = this.connection.prepareStatement("SELECT * FROM contatos");

            ResultSet resultSet = stmt.executeQuery();

            List<Contato> contatos = new ArrayList<>();

            while (resultSet.next()) {

                //Criando oobjeto Contato
                Contato contato = new Contato();

                contato.setNome(resultSet.getString("nome"));
                contato.setEmail(resultSet.getString("email"));
                contato.setEndereco(resultSet.getString("endereco"));

                //Montando a data
                Calendar dataNascimento = Calendar.getInstance();
                dataNascimento.setTime(resultSet.getDate("dataNascimento"));

                contato.setDataNascimento(dataNascimento);

                //Adicionando o contato
                contatos.add(contato);
            }

            resultSet.close();
            stmt.close();

            return contatos;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new DAOException("Erros ao criar listas de contatos.");
        }

    }

    public void altera(Contato contato) {
        String sql = "UPDATE contatos SET nome=?, email=?," +
                    "endereco=?, dataNascimento=? WHERE id=?";
        try {

            PreparedStatement stmt = this.connection.prepareStatement(sql);

            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getEndereco());
            stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
            stmt.setLong(5, contato.getId());

            stmt.execute();

            stmt.close();


        } catch (SQLException e) {
            e.printStackTrace();
            throw new DAOException("Erro ao alterar contato.");
        }
    }

    public void remove(Contato contato) {

        try {
            String sql = "DELETE FROM contatos WHERE id=?";

            PreparedStatement stmt = this.connection.prepareStatement(sql);

            stmt.setLong(1, contato.getId());

            stmt.execute();

            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new DAOException("Erro ao remover contato.");

        }

    }

}

package br.com.caelum.fj21.model;

import java.util.Calendar;

/**
 * Created by manoelferreira on 1/13/17.
 */
public class Contato {

    private long id;
    private String nome;
    private String email;
    private String endereco;
    private Calendar dataNascimento;

    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public long getId() {

        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }
}

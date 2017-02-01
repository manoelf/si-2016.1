package br.com.caelum.fj21.teste;

import br.com.caelum.fj21.model.Contato;
import br.com.caelum.fj21.model.ContatoDao;

import java.util.List;

/**
 * Created by manoelferreira on 1/13/17.
 */
public class TestList {

    public static void main(String[] args) {

        ContatoDao bd = new ContatoDao();

        List<Contato> contatos = bd.getContatos();

        for (Contato contato: contatos) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Email: " + contato.getEmail());
            System.out.println("Endereco: " + contato.getEndereco());
            System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime());
            System.out.println();
        }

    }

}

package br.com.caelum.fj21.teste;

import br.com.caelum.fj21.model.Contato;
import br.com.caelum.fj21.model.ContatoDao;

import java.util.Calendar;

/**
 * Created by manoelferreira on 1/13/17.
 */
public class TestInsert {

    public static void main(String[] args) {
        Contato contato = new Contato();

        contato.setNome("Joao");
        contato.setEmail("joao@contato.com");
        contato.setEndereco("R Marcos Antonio 3454");
        contato.setDataNascimento(Calendar.getInstance());

        //Banco de Dados :)
        ContatoDao bd = new ContatoDao();

        bd.adiciona(contato);
    }
}

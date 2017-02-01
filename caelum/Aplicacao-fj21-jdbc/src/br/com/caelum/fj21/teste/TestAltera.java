package br.com.caelum.fj21.teste;

import br.com.caelum.fj21.model.Contato;
import br.com.caelum.fj21.model.ContatoDao;

import java.util.Calendar;

/**
 * Created by manoelferreira on 1/13/17.
 */
public class TestAltera {

    public static void main(String[] args) {
        Contato contato = new Contato();

        contato.setNome("Xica");
        contato.setEmail("francisco@email.com");
        contato.setEndereco("R Piracivaba 4242");
        contato.setDataNascimento(Calendar.getInstance());
        contato.setId(5);

        ContatoDao bd = new ContatoDao();

        bd.altera(contato);

        System.out.println("Contato alterado!!!");

    }
}

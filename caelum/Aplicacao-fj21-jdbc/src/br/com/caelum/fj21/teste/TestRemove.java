package br.com.caelum.fj21.teste;

import br.com.caelum.fj21.model.Contato;
import br.com.caelum.fj21.model.ContatoDao;

/**
 * Created by manoelferreira on 1/13/17.
 */
public class TestRemove {

    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setId(8);

        ContatoDao bd = new ContatoDao();

        bd.remove(contato);

        System.out.println("Contato removido com sucesso!!!");

    }
}

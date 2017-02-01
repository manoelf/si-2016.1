package br.com.caelum.jdbc.fj21.test;

import br.com.caelum.jdbc.fj21.model.Contact;
import br.com.caelum.jdbc.fj21.model.ContactDao;

/**
 * Created by manoelferreira on 1/14/17.
 */
public class TestRemove {

    public static void main(String[] args) {

        Contact contact = new Contact();

        contact.setId(1);

        ContactDao dataBase = new ContactDao();

        dataBase.remove(contact);

        System.out.println("Contact was removed with success!!!");
    }
}

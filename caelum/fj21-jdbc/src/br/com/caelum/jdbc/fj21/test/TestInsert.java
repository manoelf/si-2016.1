package br.com.caelum.jdbc.fj21.test;

import br.com.caelum.jdbc.fj21.model.Contact;
import br.com.caelum.jdbc.fj21.model.ContactDao;

import java.util.Calendar;

/**
 * Created by manoelferreira on 1/14/17.
 */
public class TestInsert {

    public static void main(String[] args) {

        Contact contact = new Contact();

        contact.setName("Caelum");
        contact.setEmail("caelum@email.com");
        contact.setAddress("R Jardim Paulistano 324");
        contact.setBornDate(Calendar.getInstance());

        ContactDao dataBase = new ContactDao();

        dataBase.insert(contact);

        System.out.println("Contact add with success!!");

    }




}

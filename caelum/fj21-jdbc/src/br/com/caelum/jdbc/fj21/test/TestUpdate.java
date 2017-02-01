package br.com.caelum.jdbc.fj21.test;

import br.com.caelum.jdbc.fj21.model.Contact;
import br.com.caelum.jdbc.fj21.model.ContactDao;

import java.util.Calendar;

/**
 * Created by manoelferreira on 1/14/17.
 */
public class TestUpdate {

    public static void main(String[] args) {

        Contact contact = new Contact();

        contact.setName("Francisco");
        contact.setEmail("francisco@email.com");
        contact.setAddress("Av. Floriano Peixoto 4334");
        contact.setBornDate(Calendar.getInstance());
        contact.setId(2);


        ContactDao dataBase = new ContactDao();

        dataBase.update(contact);

        System.out.println("Contact updated successfully!!!");

    }
}

package br.com.caelum.jdbc.fj21.model;

import java.util.Calendar;

/**
 * Created by manoelferreira on 1/13/17.
 */
public class Contact {

    private long id;
    private String name;
    private String email;
    private String address;
    private Calendar bornDate;


    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBornDate(Calendar bornDate) {
        this.bornDate = bornDate;
    }

    public long getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public Calendar getBornDate() {
        return bornDate;
    }
}

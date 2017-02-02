package br.com.ufcg.model;

/**
 * Created by josemsf on 02/02/17.
 */
public class Task {

    private long id;
    private String name;
    private String description;




    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

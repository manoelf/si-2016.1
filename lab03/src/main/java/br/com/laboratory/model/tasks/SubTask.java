package br.com.laboratory.model.tasks;

import javax.persistence.Entity;

/**
 * Created by manoelferreira on 2/4/17.
 */
@Entity
public class SubTask extends Task {

    private String name;

    public SubTask(String name) {
       this.name = name;
        super.done = false;
    }

    public SubTask() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

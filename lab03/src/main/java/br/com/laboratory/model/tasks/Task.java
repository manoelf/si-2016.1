package br.com.laboratory.model.tasks;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * Created by manoelferreira on 2/4/17.
 */
@Entity
public abstract class Task {

    @Id
    @GeneratedValue(generator="STORE_SEQ")
    @SequenceGenerator(name="STORE_SEQ", sequenceName = "STORE_SEQ", allocationSize = 1)
    protected long id;
    protected String name;
    protected String description;
    protected boolean done;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public long getId() {
        return id;
    }
}

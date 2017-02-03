package br.com.ufcg.model;

/**
 * Created by josemsf on 02/02/17.
 */
public abstract class Task {

    private long id;
    protected String name;
    protected String description;
    protected boolean conclusion;


    public boolean isConcluded() {
        return conclusion;
    }

    public void setConclusion(boolean conclusion) {
        this.conclusion = conclusion;
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

    public void setId(long id) {
        this.id = id;
    }
}

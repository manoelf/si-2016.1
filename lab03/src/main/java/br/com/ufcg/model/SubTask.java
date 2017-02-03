package br.com.ufcg.model;

/**
 * Created by josemsf on 02/02/17.
 */
public class SubTask extends Task{

    public SubTask(String name, String description) {
        super.name = name;
        super.description = description;
        super.setConclusion(false);
    }

}

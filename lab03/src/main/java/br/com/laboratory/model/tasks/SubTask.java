package br.com.laboratory.model.tasks;

/**
 * Created by manoelferreira on 2/4/17.
 */
public class SubTask extends Task {

    public SubTask(String name, String description) {
        super.name = name;
        super.description = description;
        super.done = false;
    }

}

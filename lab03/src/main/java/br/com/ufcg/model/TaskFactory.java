package br.com.ufcg.model;

/**
 * Created by manoelferreira on 2/2/17.
 */
public class TaskFactory {

    public TaskFactory() {}


    public Task createRealTask(String name, String description, String category, Label label) {
        return new RealTask(name, description, category, label);
    }

    public Task createSubTask(String name, String description) {
        return new SubTask(name, description);
    }
}

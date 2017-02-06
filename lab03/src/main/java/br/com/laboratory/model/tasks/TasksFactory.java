package br.com.laboratory.model.tasks;

/**
 * Created by manoelferreira on 2/4/17.
 */
public class TasksFactory {

    public SubTask createSubTask(String name, String description) {
        return new SubTask(name, description);
    }

    public RealTask createRealtask(String name, String description, String category, Priority priority) {
        return new RealTask(name, description, category, priority);
    }

}

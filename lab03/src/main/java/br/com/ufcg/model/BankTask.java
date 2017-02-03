package br.com.ufcg.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manoelferreira on 2/2/17.
 */
public class BankTask {

    private List<RealTask> tasks;


    public BankTask () {
        this.tasks = new ArrayList<>();
    }

    public void addTask(RealTask task) {
        this.tasks.add(task);
    }

    public void removeTask(RealTask task) {
        this.tasks.remove(task);
    }

    public void cleanTasks() {
        this.tasks.clear();
    }

    public RealTask searchByName(String name) {
        RealTask result = null;
        for (RealTask task: this.tasks) {
            if (task.getName().equalsIgnoreCase(name)) {
                result = task;
            }
        }
        return result;
    }

    public List<RealTask> search(Label label) {
        List<RealTask> result = new ArrayList<>();
        for (RealTask task: this.tasks) {
            if (task.getLabel().equals(label)) {
                result.add(task);
            }
        }
        return result;
    }

    public List<RealTask> search(String category) {
        List<RealTask> result = new ArrayList<>();

        for (RealTask task: this.tasks) {
            if (task.getCategory().equalsIgnoreCase(category)) {
                result.add(task);
            }
        }

        return result;
    }

}

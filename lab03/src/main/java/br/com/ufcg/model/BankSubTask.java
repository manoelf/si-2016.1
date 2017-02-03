package br.com.ufcg.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manoelferreira on 2/2/17.
 */
public class BankSubTask {

    private List<SubTask> subTasks;

    public BankSubTask() {
        this.subTasks = new ArrayList<>();
    }

    public void addSubTask(SubTask subTask) {
        this.subTasks.add(subTask);
    }

    public void removeSubtask(SubTask subTask) {
        this.subTasks.remove(subTask);
    }

}

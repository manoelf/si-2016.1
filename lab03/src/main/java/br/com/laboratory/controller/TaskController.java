package br.com.laboratory.controller;

import br.com.laboratory.model.banks.TasksBank;
import br.com.laboratory.model.tasks.RealTask;
import br.com.laboratory.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by manoelferreira on 2/4/17.
 */
public class TaskController {

    @Autowired
    private TaskService taskService;

    private TasksBank tasksBank;

    public TaskController() {
        this.tasksBank = new TasksBank();
    }

    public void addTask(RealTask task) {
        this.tasksBank.addTask(task);
    }

    public void removeTask(RealTask task) {
        this.tasksBank.removeTask(task);
    }

    public List<RealTask> getAllTask() {
        List<RealTask> tasks = this.tasksBank.getAllTask();
        return tasks;
    }
}

package br.com.laboratory.service;

import br.com.laboratory.model.banks.TaskBank;
import br.com.laboratory.model.tasks.RealTask;
import br.com.laboratory.model.tasks.Task;
import br.com.laboratory.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by manoelferreira on 2/5/17.
 */
@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    private Set<String> categories;

    public TaskService() {
        this.categories = new HashSet<>();
    }

    public void addTaskBank(TaskBank taskBank) {
        this.taskRepository.save(taskBank);
    }

    public void removeTask(TaskBank task) {
        this.taskRepository.delete(task);
    }

    public void addTask(String bankName, RealTask task) {
        for (TaskBank taskBank: taskRepository.findAll()) {
            if (taskBank.getName().equals(bankName)) {
                taskBank.addTask(task);
                taskRepository.save(taskBank);
            }

        }
    }

    public List<RealTask> getAllTasks() {
        List<RealTask> allTasks = new ArrayList<>();
        for (TaskBank taskBank: taskRepository.findAll()) {
            allTasks.addAll(taskBank.getAllTask());
        }
        return allTasks;
    }

    public List<TaskBank> getAllTaskBank() {
        List<TaskBank> allTaskBanks = new ArrayList<>();
        allTaskBanks.addAll(this.taskRepository.findAll());
        return allTaskBanks;
    }

    public void addCategory(String category) {
        this.categories.add(category);
    }

    public void removeCategory(String category) {
        this.categories.remove(category);
    }

    public List<RealTask> getAllTaskOfCategory(String categorName) {
        List<RealTask> allTask = new ArrayList<>();
        for (RealTask task: getAllTasks()) {
            if (task.getCategory().equals(categorName)) {
                allTask.add(task);
            }
        }
        return allTask;
    }

    public Set<String> getAllCategory() {
        return this.categories;
    }

}

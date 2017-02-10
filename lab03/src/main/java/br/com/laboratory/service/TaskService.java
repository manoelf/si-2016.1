package br.com.laboratory.service;

import br.com.laboratory.model.banks.TaskBank;
import br.com.laboratory.model.tasks.CompareByPriority;
import br.com.laboratory.model.tasks.RealTask;
import br.com.laboratory.model.tasks.Task;
import br.com.laboratory.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Collections.sort;

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
        this.categories.add("Nome");
        this.categories.add("Work");
        this.categories.add("Study");
        this.categories.add("Fun");
        //this.taskRepository.save(new TaskBank("root"));
    }

    public void addTaskBank(TaskBank taskBank) {
        this.taskRepository.save(taskBank);
    }


    public void addTask(String bankName, RealTask task) {
        for (TaskBank taskBank: taskRepository.findAll()) {
            if (taskBank.getName().equals(bankName)) {
                taskBank.addTask(task);
                taskRepository.save(taskBank);
            }

        }
    }
    public void deleteTask(String taskBank, String taskName) {
        for (TaskBank bank: this.taskRepository.findAll()) {
            if (bank.getName().equals(taskBank)) {
                bank.removeTask(taskName);
            }


        }
    }

    public void addCategory(String category) {
        this.categories.add(category);
    }

    public void removeCategory(String category) {
        this.categories.remove(category);
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

    public List<RealTask> getAllDone() {
        List<RealTask> allDone = new ArrayList<>();
        for (RealTask task : getAllTasks()) {
            if (task.isDone()) {
                allDone.add(task);
            }
        }
        return allDone;
    }

    public void sortByName() {
        for (TaskBank taskBank: getAllTaskBank()) {
            sort(taskBank.getAllTask());
        }
    }

    public void sortByPriority() {
        for (TaskBank taskBank: getAllTaskBank()) {
            taskBank.getAllTask().sort(new CompareByPriority());
        }
    }

    public List<RealTask> showAllTaskSortedByName() {
        List<RealTask> sorted = getAllTasks();
        sort(sorted);
        return sorted;
    }

    public List<RealTask> showAllTaskSortedByPriority() {
        List<RealTask> sorted = getAllTasks();
        sorted.sort(new CompareByPriority());
        return sorted;
    }

    public List<RealTask> getTestkByCategory(String category) {
        List<RealTask> allTask = new ArrayList<>();
        for (RealTask task: getAllTasks()) {
            if (task.getCategory().equals(category)) {
                allTask.add(task);
            }
        }
        return allTask;
    }

    public List<RealTask> getAllTaskOfPriority(String priority) {
        List<RealTask> allTask = new ArrayList<>();
        for (RealTask task: getAllTasks()) {
            if (task.getPriority().toString().equals(priority)) {
                allTask.add(task);
            }
        }
        return allTask;
    }
}

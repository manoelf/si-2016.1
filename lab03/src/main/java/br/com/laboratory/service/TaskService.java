package br.com.laboratory.service;

import br.com.laboratory.model.banks.TaskBank;
import br.com.laboratory.model.tasks.RealTask;
import br.com.laboratory.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manoelferreira on 2/5/17.
 */
@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public void addTaskBank(TaskBank taskBank) {
        this.taskRepository.save(taskBank);
        this.taskRepository.save(new TaskBank("root"));
    }

    public void removeTask(TaskBank task) {
        this.taskRepository.delete(task);
    }

    public void addTask(String bankName, RealTask task) {
        for (TaskBank taskBank: taskRepository.findAll()) {
            if (taskBank.getName().equals(bankName)) {
                taskBank.addTask(task);
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
}

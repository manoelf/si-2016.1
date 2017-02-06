package br.com.laboratory.service;

import br.com.laboratory.model.banks.TasksBank;
import br.com.laboratory.model.tasks.Task;
import br.com.laboratory.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by manoelferreira on 2/5/17.
 */
@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;
    private TasksBank tasksBank;

    public TaskService() {
        this.tasksBank = new TasksBank();
    }

    public void addTask(Task task) {
        this.taskRepository.save(task);
    }

    public void removeTask(Task task) {
        this.taskRepository.delete(task);
    }



}

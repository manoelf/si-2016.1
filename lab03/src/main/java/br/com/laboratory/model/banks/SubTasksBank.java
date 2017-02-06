package br.com.laboratory.model.banks;

import br.com.laboratory.model.tasks.SubTask;
import br.com.laboratory.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manoelferreira on 2/4/17.
 */
@Service
public class SubTasksBank {

    private TaskRepository taskRepository;

    private List<SubTask> subTasks;

    public SubTasksBank() {
        this.subTasks = new ArrayList<>();
    }

    public void addSubTask(SubTask subTask) {
        this.subTasks.add(subTask);
    }

    public void removeSubTask(SubTask subTask) {
        this.subTasks.remove(subTask);
    }

    public void removeSubtask(String name) {
        for (SubTask task: this.subTasks) {
            if (task.getName().equalsIgnoreCase(name)) {
                this.subTasks.remove(task);
            }
        }
    }


}

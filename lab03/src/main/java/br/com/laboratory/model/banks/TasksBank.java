package br.com.laboratory.model.banks;

import br.com.laboratory.model.tasks.RealTask;
import com.sun.org.apache.regexp.internal.RE;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by manoelferreira on 2/4/17.
 */
public class TasksBank {

    @OneToMany(cascade = {CascadeType.ALL})
    private List<RealTask> tasks;

    public TasksBank() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(RealTask task) {
        this.tasks.add(task);
    }

    public void removeTask(RealTask task) {
        this.tasks.remove(task);
    }

    public List<RealTask> getAllTask() {
        return this.tasks;
    }
}

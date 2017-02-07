package br.com.laboratory.model.banks;

import br.com.laboratory.model.tasks.RealTask;
import com.sun.org.apache.regexp.internal.RE;

import javax.persistence.*;
import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by manoelferreira on 2/4/17.
 */
@Entity
public class TaskBank {
    @Id
    @GeneratedValue(generator="STORE_SEQ")
    @SequenceGenerator(name="STORE_SEQ", sequenceName = "STORE_SEQ", allocationSize = 1)
    protected long id;

    private String name;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<RealTask> tasks;

    public TaskBank(String name) {
        this.name = name;
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

    public String getName() {
        return name;
    }
}

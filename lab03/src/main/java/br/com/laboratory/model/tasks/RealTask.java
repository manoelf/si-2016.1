package br.com.laboratory.model.tasks;

import br.com.laboratory.model.banks.SubTasksBank;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.Calendar;

/**
 * Created by manoelferreira on 2/4/17.
 */
public class RealTask extends Task{

    private Priority priority;
    private String category;
    private Calendar time;
    @OneToMany(cascade = {CascadeType.ALL})
    private SubTasksBank subTasksBank;

    public RealTask(String name, String description, String category, Priority priority) {
        super.name = name;
        super.description = description;
        super.done = false;
        this.priority = priority;
        this.subTasksBank = new SubTasksBank();
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public void addSubTask(SubTask subTask) {
        this.subTasksBank.addSubTask(subTask);
    }

    public void removeSubTask(SubTask subTask) {
        this.subTasksBank.removeSubTask(subTask);
    }

}

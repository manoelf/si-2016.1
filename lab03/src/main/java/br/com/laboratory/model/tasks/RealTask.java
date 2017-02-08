package br.com.laboratory.model.tasks;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by manoelferreira on 2/4/17.
 */
@Entity
public class RealTask extends Task{

    private Priority priority;
    private String category;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<SubTask> subTasksBank;

    public RealTask(String name, String description, String category, Priority priority) {
        super.name = name;
        super.description = description;
        this.priority = priority;
        this.category =  category;
        this.subTasksBank = new ArrayList<>();
        super.done = false;
    }

    public RealTask() {}

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

    public void addSubTask(SubTask subTask) {
        this.subTasksBank.add(subTask);
    }

    public void removeSubTask(SubTask subTask) {
        this.subTasksBank.remove(subTask);
    }

    public List<SubTask> getAllSubTask() {
        return this.subTasksBank;
    }
}

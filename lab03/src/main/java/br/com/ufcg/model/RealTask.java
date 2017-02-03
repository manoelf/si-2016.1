package br.com.ufcg.model;

import java.util.Calendar;
import java.util.List;

/**
 * Created by josemsf on 02/02/17.
 */
public class RealTask extends Task{

    private String category;
    private Label label;
    private Calendar time;
    private BankSubTask subTasks;


    public RealTask(String name, String description, String category, Label label) {
        super.name = name;
        super.description = description;
        this.category = category;
        this.label = label;
        this.subTasks = new BankSubTask();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public BankSubTask getSubTasks() {
        return subTasks;
    }



}

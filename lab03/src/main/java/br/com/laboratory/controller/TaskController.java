package br.com.laboratory.controller;

import br.com.laboratory.model.banks.TaskBank;
import br.com.laboratory.model.tasks.RealTask;
import br.com.laboratory.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by manoelferreira on 2/4/17.
 */
@Controller
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping(value = "/taskList", method = RequestMethod.GET)
    public String taskList(Model model) {
        model.addAttribute("taskList", taskService.getAllTasks());
        return "task/tasklist";
    }

    @RequestMapping(value = "/newTask", method = RequestMethod.GET)
    public String newTask(Model model) {
        return "task/taskform";
    }


    @RequestMapping(value = "/addTask", method = RequestMethod.POST)
    public String addTask(@ModelAttribute RealTask task, Model model) {
        taskService.addTask("root", task);
        return "task/tasklist";
    }

}

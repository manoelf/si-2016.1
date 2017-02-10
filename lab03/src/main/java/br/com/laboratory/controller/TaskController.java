package br.com.laboratory.controller;

import br.com.laboratory.model.banks.TaskBank;
import br.com.laboratory.model.tasks.RealTask;
import br.com.laboratory.model.tasks.SubTask;
import br.com.laboratory.model.tasks.Task;
import br.com.laboratory.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by manoelferreira on 2/4/17.
 */
@Controller
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService     taskService;

    @RequestMapping(value = "/newTask", method = RequestMethod.GET)
    public String newTask(Model model) {
        model.addAttribute("allCategories", taskService.getAllCategory());
        model.addAttribute("bankNames", this.taskService.getAllTaskBank());
        return "task/taskform";
    }


    @RequestMapping(value = "/addTask", method = RequestMethod.POST)
    public String addTask(@ModelAttribute RealTask task, String subTaskList, String bankName, Model model) {
        for (String subTaskName: subTaskList.split(",")) {
            task.addSubTask(new SubTask(subTaskName));
        }

        this.taskService.addTask(bankName, task);
        model.addAttribute(task);
        model.addAttribute("allSubtask", task.getAllSubTask());
        return "redirect:/task/taskList";
    }


    @RequestMapping(value = "/taskList", method = RequestMethod.GET)
    public String taskList(Model model) {
        model.addAttribute("taskList", taskService.getAllTasks());
        return "task/tasklist";
    }


    @RequestMapping(value = "newTaskBank", method = RequestMethod.GET)
    public String newTaskBank(Model model) {
        return "task/taskbankform";
    }

    @RequestMapping(value = "addTaskBank", method = RequestMethod.POST )
    public String addTaskBankForm(@ModelAttribute TaskBank taskBank, Model model) {
        taskService.addTaskBank(taskBank);
        return "redirect:/task/taskBankList";
    }

    @RequestMapping(value = "taskBankList", method = RequestMethod.GET)
    public String taskBankList(Model model) {
        model.addAttribute("taskBankList", taskService.getAllTaskBank());
        return "task/taskbanklist";
    }

    @RequestMapping(value = "newCategory", method = RequestMethod.GET)
    public String newCategory(Model model) {
        return "task/categoryform";
    }

    @RequestMapping(value = "addCategory", method = RequestMethod.POST)
    public String addCategoryForm(String category, Model model) {
        taskService.addCategory(category);
        return "redirect:/task/categoryList";
    }

    @RequestMapping(value = "categoryList", method = RequestMethod.GET)
    public String categoryList(Model model) {
        model.addAttribute("categoryList", taskService.getAllCategory());
        return "task/categorylist";
    }

    @RequestMapping(value = "getCategories", method = RequestMethod.POST)
    public String getCategories(Model model) {
        model.addAttribute("allCategories", taskService.getAllCategory());
        return "redirect:/task/categoryList";
    }

    private List<RealTask> tasksTemp;// = new ArrayList<>();

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public String filterByCategoryForm(Model model) {
        model.addAttribute("allCategories", taskService.getAllCategory());
        return "task/filtercategoryform";
    }

    @RequestMapping(value = "byCategories", method = RequestMethod.POST)
    public String filterByCategory(String category, Model model) {
        tasksTemp =  taskService.getAllTaskOfCategory(category);
        return "redirect:/task/temp";
    }

    @RequestMapping(value = "/temp", method = RequestMethod.GET)
    public String temp(Model model) {
        model.addAttribute("allCategories", tasksTemp);
        return "task/allbycategory";
    }

    @RequestMapping(value = "/priorities", method = RequestMethod.GET)
    public String filterByPriorityForm(Model model) {
        return "task/allbypriorityform";
    }

    @RequestMapping(value = "/byPriorities", method = RequestMethod.POST)
    public String filterByPriority(String priority, Model model) {
        tasksTemp =  taskService.getAllTaskOfPriority(priority);
        return "redirect:/task/prioritySelected";
    }

    @RequestMapping(value = "/prioritySelected", method = RequestMethod.GET)
    public String showPrioritiesSelected(Model model) {
        model.addAttribute("allPriorities", tasksTemp);
        return "task/allbypriorities";
    }



}

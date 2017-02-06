package br.com.laboratory.run;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by manoelferreira on 2/4/17.
 */
@Controller
@RequestMapping("/task")
public class AppController {

    @RequestMapping(value="", method=RequestMethod.GET)
    public String listPosts(Model model) {
        return "task/index";
    }
}

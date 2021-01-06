package com.mihasya.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "my_first_view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
        model.addAttribute("employee",new Employee());
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@ModelAttribute("employee") Employee employee){
        employee.setName("Mr. " + employee.getName());
        return "show-emp-details-view";
    }
}

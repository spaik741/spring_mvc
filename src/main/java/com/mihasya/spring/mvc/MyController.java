package com.mihasya.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "my_first_view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        }
        employee.setName("Mr. " + employee.getName());
        return "show-emp-details-view";
    }
}

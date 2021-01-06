package com.mihasya.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "my_first_view";
    }
    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "ask-emp-details-view";
    }
    @RequestMapping("/showDetails")
    public String showEmployeeDetails(HttpServletRequest request, Model model){
        String name = "Mr." + request.getParameter("employeeName");
        model.addAttribute("nameAttribute", name);
        return "show-emp-details-view";
    }
}

package com.hsenid.SpringWebApplication.controllers;

import com.hsenid.SpringWebApplication.repositories.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @RequestMapping("/employees")
    public String getEmployees(Model model){
        model.addAttribute("Employees", employeeRepository.findAll());
        return "Employees";
    }
}
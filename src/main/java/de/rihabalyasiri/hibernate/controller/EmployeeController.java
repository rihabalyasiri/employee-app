package de.rihabalyasiri.hibernate.controller;

import de.rihabalyasiri.hibernate.entity.Employee;
import de.rihabalyasiri.hibernate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String getEmployees(Model model) {
        Collection<Employee> employees = employeeService.findAll();
        model.addAttribute("employees", employees);
        return "employeesList";
    }

    @GetMapping("/employeeForm")
    public String getEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employeeAddForm";
    }

    @GetMapping("/addEmployee")
    public String addEmployee(@ModelAttribute Employee employeeModel) {
        employeeService.save(employeeModel);
        //using redirect to avoid duplicate
        return "redirect:/";
    }

    @GetMapping("/updateEmployee")
    public String updateEmployee(@RequestParam int employeeId, Model model) {
        Employee employee = employeeService.findById(employeeId);
        model.addAttribute("employee", employee);
        return "employeeAddForm";
    }

    @GetMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam int employeeId) {
       employeeService.deleteById(employeeId);
        return "redirect:/";
    }
}

/*
package de.rihabalyasiri.hibernate.rest;

import de.rihabalyasiri.hibernate.entity.Employee;
import de.rihabalyasiri.hibernate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployess() {
        return employeeService.findAll();

    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        Employee employee = employeeService.findById(employeeId);

        if(employee == null) {
            throw  new RuntimeException("Employee not found with id - " + employeeId);
        }

        return employee;
    }
    // update or add new record (if id is already exist than update otherwise add)
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        employee.setId(0);
        employeeService.save(employee);
        return employee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        Employee employee = employeeService.findById(employeeId);
        if(employee == null) {
            throw new RuntimeException("Employee not found with id - " + employeeId);
        }
        employeeService.deleteById(employeeId);
        return "Employee with id - " + employeeId + " is deleted.";

    }
}
*/

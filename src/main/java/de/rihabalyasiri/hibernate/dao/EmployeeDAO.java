package de.rihabalyasiri.hibernate.dao;

import de.rihabalyasiri.hibernate.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;


public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int id);

    void save(Employee employee);

    void deleteById(int id);
}

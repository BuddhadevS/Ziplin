package com.example.zipkinn.service;


import com.example.zipkinn.model.Employee;
import com.example.zipkinn.repository.EmployeeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepo repository;

    public List<Employee> getAllEmployees() {
        System.out.println("Fetching all employees from the database");
        log.info("Fetching all employees from the database from manoj branch");
        log.warn("This is a warning log example");
        return repository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }
}

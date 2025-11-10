package com.example.zipkinn.Controller;

import com.example.zipkinn.model.Employee;
import com.example.zipkinn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employees")

public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }
}

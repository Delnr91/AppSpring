package com.example.demo.controller;


import com.example.demo.entities.Employee;

import com.example.demo.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    //Inyección de dependencias del servicio

    @Autowired
    private IEmployeeService service;

    @GetMapping("/api/employees")
    public List<Employee> getAll(){
        return service.getAll();
    }
    @GetMapping("/api/employees/{id}")
    public Employee getById(@PathVariable String id){
        return service.getById(Long.parseLong(id));
    }
    @PostMapping("/api/employees")
    public void save (@RequestBody Employee employee){
        service.save(employee);

    }
    @DeleteMapping("/api/employees/{id}")
    public void remove (@PathVariable String id){
        service.remove(Long.parseLong(id));

    }
}

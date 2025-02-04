package com.example.demo.services;

import com.example.demo.entities.Employee;

import java.util.List;

public interface IEmployeeService {


    List<Employee> getAll();

    Employee getById(Long id);

    void save(Employee employee);

    void remove(Long id);
}

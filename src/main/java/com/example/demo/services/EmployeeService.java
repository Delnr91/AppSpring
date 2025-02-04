package com.example.demo.services;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Employee;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{

    //inyección de dependecias
    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> getAll() {
        return (List<Employee>) repository.findAll();
    }

    @Override
    public Employee getById(Long id) {
        return (Employee) repository.findById(id).get();
    }

    @Override
    public void save(Employee employee) {
        repository.save(employee);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);

    }
}

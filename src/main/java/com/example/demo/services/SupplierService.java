package com.example.demo.services;


import com.example.demo.entities.Employee;
import com.example.demo.entities.Supplier;
import com.example.demo.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService implements ISupplierService{

    //inyección de dependecias
    @Autowired
    private SupplierRepository repository;

    @Override
    public List<Supplier> getAll() {
        return (List<Supplier>) repository.findAll();
    }

    @Override
    public Supplier getById(Long id) {
        return (Supplier) repository.findById(id).get();
    }

    @Override
    public void save(Supplier supplier) {
        repository.save(supplier);
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);

    }
}

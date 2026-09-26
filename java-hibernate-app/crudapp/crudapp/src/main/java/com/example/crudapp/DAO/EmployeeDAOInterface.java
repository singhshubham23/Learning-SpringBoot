package com.example.crudapp.DAO;

import com.example.crudapp.entity.Employee;

import java.util.List;

public interface EmployeeDAOInterface {
    void save(Employee employee);
    Employee findById(int id);
    List<Employee> findAll();
}

package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    Collection<Employee> showEmp(){
        return employeeDAO.getEmployees().values();
    }

    void addEmp(Employee newEmployee) {
        employeeDAO.addEmployee(newEmployee);
    }

    void updateEmp(int upId, Employee upEmployee) {
        employeeDAO.updateEmployee(upId, upEmployee);
    }

    void deleteEmp(int delId) {
        employeeDAO.deleteEmployee(delId);
    }
}

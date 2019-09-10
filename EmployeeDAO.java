package com.example.rest;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDAO {
    private Map<Integer, Employee> employees = new HashMap<>();

    @PostConstruct
    public void populateData() {
        Employee e1 = new Employee(1, "A", 100000);
        Employee e2 = new Employee(2, "B", 50000);
        Employee e3 = new Employee(3, "C", 25000);

        employees.put(e1.getId(), e1);
        employees.put(e2.getId(), e2);
        employees.put(e3.getId(), e3);
    }

    public Map<Integer, Employee> getEmployees() {
        return employees;
    }

    public void deleteEmployee(int id) {
        employees.remove(id);
    }

    public Employee getEmployee(int id) {
        return employees.get(id);
    }

    public void updateEmployee(int id, Employee employee) {
        employees.replace(id, employee);
    }

    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }
}

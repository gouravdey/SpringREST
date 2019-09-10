package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class GreetController {

    @Autowired
    private EmployeeService employeeService;

    Employee newEmp = new Employee(4,"D", 40000);
    Employee upEmp = new Employee(3,"C", 60000);

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable("id") int id){
        employeeService.deleteEmp(id);
        return id + " employee deleted.";
    }

    @RequestMapping("/show")
    @ResponseBody
    public Collection<Employee> show(){
        return employeeService.showEmp();
    }

    @RequestMapping("/update/{id}")
    @ResponseBody
    public String update(@PathVariable("id") int id) {
        employeeService.updateEmp(id, upEmp);
        return id + " employee updated.";
    }

    @RequestMapping("create")
    @ResponseBody
    public String create() {
        employeeService.addEmp(newEmp);
        return "Employee added";
    }
}

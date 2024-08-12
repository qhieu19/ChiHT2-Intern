package edu.poly.day1.controller;

import edu.poly.day1.entity.Employee;
import edu.poly.day1.service.EmployeeSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeSerive serive;

    @GetMapping("/hien-thi")
    public List<Employee> getAll(){
        return serive.getAll();
    }


}

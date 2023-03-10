package com.bootcoding.discount.controller;

import com.bootcoding.discount.model.Student;
import com.bootcoding.discount.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/student")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }



}

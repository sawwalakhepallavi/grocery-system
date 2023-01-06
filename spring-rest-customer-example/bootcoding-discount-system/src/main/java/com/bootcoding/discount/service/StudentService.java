package com.bootcoding.discount.service;

import com.bootcoding.discount.model.Customer;
import com.bootcoding.discount.model.Student;
import com.bootcoding.discount.utils.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getAllStudent(){
        List<Student> students=new ArrayList<>();
        for(int i=0;i<10;i++){
            Student student=buildRandomStudent();
            students.add(student);
        }
        return students;
    }
    public Student buildRandomStudent(){
        Student student=new Student();
        student.setName(NameGenerator.getName());
        student.setMarks(MarksGenerator.getMarks());
        student.setSubject(SubjectGenerator.getSubject());

        return student;
    }
}

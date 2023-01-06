package com.bootcoding.discount.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String Name;
    private int marks;
    private String subject;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


}

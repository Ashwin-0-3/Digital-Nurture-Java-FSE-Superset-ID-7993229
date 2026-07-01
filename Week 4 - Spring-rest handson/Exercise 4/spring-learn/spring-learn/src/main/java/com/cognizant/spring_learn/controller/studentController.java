package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.Student;
import com.cognizant.spring_learn.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studentController
{
    @Autowired
    private studentService ser;

    @GetMapping("/all")
    public List<Student> get()
    {
        return ser.get1();
    }

    @GetMapping("/all/{id}")
    public Student bring(@PathVariable Integer id)
    {
        return ser.get2(id);
    }

    @PostMapping("/post")
    public Student put(@RequestBody Student s)
    {
        return ser.put1(s);
    }

    @PutMapping("/put")
    public void putt(@RequestBody Student s2)
    {
        ser.put2(s2);
    }

    @DeleteMapping("/delete/{id}")
    public void del(@PathVariable Integer id)
    {
        ser.dell(id);
    }
}
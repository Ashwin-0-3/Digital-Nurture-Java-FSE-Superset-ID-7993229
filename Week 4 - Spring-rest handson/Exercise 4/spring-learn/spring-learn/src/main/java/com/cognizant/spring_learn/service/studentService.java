package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.model.Student;
import com.cognizant.spring_learn.repository.studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService
{
    @Autowired
    private studentrepo rep;

    public List<Student> get1()
    {
        return rep.findAll();
    }

    public Student get2(Integer id)
    {
        return rep.findById(id).orElse(null);
    }

    public Student put1(Student s)
    {
        return rep.save(s);
    }

    public void put2(Student s)
    {
        rep.save(s);
    }
    public void dell(Integer id)
    {
        rep.deleteById(id);
    }
}
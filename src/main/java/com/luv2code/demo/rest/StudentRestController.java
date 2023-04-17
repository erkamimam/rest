package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    //define endpoint for "/students" - return list of students


    //http://localhost:8080/api/students
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> theStudents = new ArrayList<>();
        theStudents.add(new Student("erkam", "imam"));
        theStudents.add(new Student("mustafa", "acar"));
        theStudents.add(new Student("mary", "morone"));
        theStudents.add(new Student("ali", "ali"));
        return theStudents;
    }
}

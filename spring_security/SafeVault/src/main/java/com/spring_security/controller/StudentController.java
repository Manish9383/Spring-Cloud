package com.spring_security.controller;

import com.spring_security.models.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(
            List.of(new Student(1, "Manish", 89),
                    new Student(2, "Arpita", 98),
                    new Student(3, "Raj", 76))
    );

    @GetMapping("/students")
    public List<Student> getStudent(){
        return students;
    }

    @GetMapping("/csrf-token")
    public CsrfToken csrf(HttpServletRequest request, CsrfToken token) {
        return token;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }
}

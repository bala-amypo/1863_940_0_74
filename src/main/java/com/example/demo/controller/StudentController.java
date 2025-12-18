package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/postdata")
    public ResponseEntity<Student> postdata(
            @Valid @RequestBody Student student) {

        return studentService.saveStudent(student);
    }
}

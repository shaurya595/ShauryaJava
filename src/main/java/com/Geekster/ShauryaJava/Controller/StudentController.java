package com.Geekster.ShauryaJava.Controller;

import com.Geekster.ShauryaJava.Student;
import com.fasterxml.jackson.annotation.JacksonAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired //ye jo config hua hai usko connect kr k object bnayega
    Student s1;
    @GetMapping("/student")
    public Student getStudent(){
        return s1;
    }
}

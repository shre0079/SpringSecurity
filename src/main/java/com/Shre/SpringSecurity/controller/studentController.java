package com.Shre.SpringSecurity;

import com.Shre.SpringSecurity.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class studentController{

    List<Student> students = new ArrayList<>(List.of(
            new Student(1,"Navin","Java"),
            new Student(2,"Kiran","BlockChain")
    ));

    @GetMapping("students")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("students")//won't work without csrf
    public void addStudents(@RequestBody Student student) {
        students.add(student);
    }

    @GetMapping("token")
    public CsrfToken getToken(HttpServletRequest token) {
        return (CsrfToken) token.getAttribute("_csrf");
    }
}

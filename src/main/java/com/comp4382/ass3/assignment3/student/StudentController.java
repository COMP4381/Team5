package com.comp4382.ass3.assignment3.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * StudentController
 */
@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public ArrayList<Student> getAllStudents(@RequestParam(value = "university", required = false) String university,
            @RequestParam(value = "year", required = false) String year) {
        ArrayList<Student> students = new ArrayList<Student>();
        return students;
    }

    @GetMapping("/students/{id}")
    public Student getUserById(@PathVariable Integer id) {
        if (id != null)
            return new Student();
        else
            return null;
    }

    @PostMapping("/students")
    public void addNewStudent(@RequestBody Student student) {
        //
    }

    @PutMapping("/students/{id}")
    public void editStudent(@RequestBody Student newStudent, @PathVariable int id) {
        //
    }

    @DeleteMapping("students/{id}")
    public void deleteStudent(@PathVariable int id) {
        //
    }
}
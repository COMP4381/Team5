package com.comp4382.ass3.assignment3.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // @PostMapping("/students")
    // public ResponseEntity<Object> createStudent(@RequestBody Student student) {
    // Student savedStudent = studentRepository.save(student);

    // URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
    // .buildAndExpand(savedStudent.getId()).toUri();

    // return ResponseEntity.created(location).build();

    // }
}
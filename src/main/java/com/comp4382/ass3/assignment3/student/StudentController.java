package com.comp4382.ass3.assignment3.student;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

/**
 * StudentController
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @ApiOperation(value = "Get all students")
    @GetMapping
    public ArrayList<Student> getAllStudents(@RequestParam(value = "university", required = false) String university,
            @RequestParam(value = "year", required = false) String year) {
        ArrayList<Student> students = new ArrayList<Student>();
        return students;
    }

    @ApiOperation(value = "Get a student by his/her id")
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        if (id != null)
            return new Student();
        else
            return null;
    }

    @ApiOperation(value = "Add a new student")
    @PostMapping
    public void addNewStudent(@RequestBody Student student) {
        //
    }

    @ApiOperation(value = "Edit an existing student by his/her id")
    @PutMapping("/{id}")
    public void editStudent(@RequestBody Student newStudent, @PathVariable int id) {
        //
    }

    @ApiOperation(value = "Delete an existing student by his/her id")
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        //
    }
}
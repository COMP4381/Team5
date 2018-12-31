package com.comp4382.ass3.assignment3.course;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Pageable;

/**
 * CourseController
 */
@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public ArrayList<Course> getAllCourses(@RequestParam(value = "university", required = false) String university,
            @RequestParam(value = "year", required = false) String year) {
        ArrayList<Course> courses = new ArrayList<Course>();
        return courses;
    }

    @GetMapping("/courses/{id}")
    public Course getUserById(@PathVariable Integer id) {
        if (id != null)
            return new Course();
        else
            return null;
    }

    @PostMapping("/courses")
    public void addNewCourse(@RequestBody Course course) {
        //
    }

    @PutMapping("/courses/{id}")
    public void editCourse(@RequestBody Course newCourse, @PathVariable int id) {
        //
    }

    @DeleteMapping("courses/{id}")
    public void deleteCourse(@PathVariable int id) {
        //
    }

}
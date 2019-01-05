package com.comp4382.ass3.assignment3.course;

import io.swagger.annotations.ApiOperation;

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

/**
 * CourseController
 */
@RestController
@RequestMapping("/courses")
public class CourseController {

    // @Autowired
    // private CourseService courseService;

    @ApiOperation(value = "Get all courses")
    @GetMapping
    public ArrayList<Course> getAllCourses(@RequestParam(value = "university", required = false) String university,
            @RequestParam(value = "year", required = false) String year) {
        ArrayList<Course> courses = new ArrayList<Course>();
        return courses;
    }

    @ApiOperation(value = "Get a course by its id")
    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Integer id) {
        if (id != null)
            return new Course();
        else
            return null;
    }

    @ApiOperation(value = "Add a new course")
    @PostMapping
    public void addNewCourse(@RequestBody Course course) {
        //
    }

    @ApiOperation(value = "Edit an existing course by its id")
    @PutMapping("/{id}")
    public void editCourse(@RequestBody Course newCourse, @PathVariable int id) {
        //
    }

    @ApiOperation(value = "Delete an existing course by its id")
    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable int id) {
        //
    }

}
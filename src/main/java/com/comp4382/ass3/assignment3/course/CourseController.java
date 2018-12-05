package com.comp4382.ass3.assignment3.course;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getCourses(Pageable page, @PathVariable(name = "id", required = false) Integer id) {
        if (id != null) {
            return Optional.ofNullable(courseService.getCourseById(id)).map(course -> ResponseEntity.ok().body(course))
                    .orElseGet(() -> ResponseEntity.notFound().build());
            // return ResponseEntity.ok(courseService.getCourseById(id));
        }
        return Optional.ofNullable(courseService.getCourses(page)).map(course -> ResponseEntity.ok().body(course))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
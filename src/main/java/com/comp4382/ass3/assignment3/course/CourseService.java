package com.comp4382.ass3.assignment3.course;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * CourseService
 */
@Service
public class CourseService {
    private static final Logger logger = Logger.getLogger("Course Service");
    @Autowired
    private CourseRepository courseRepository;

    public Page<Course> getCourses(Pageable page) {
        logger.info("get Courses");
        return courseRepository.findAll(page);
    }

    // public Page<Course> searchCoursesByCode(Pageable page, String code){
    // return courseRepository.getCoursesByCode(page, code)
    // }

    // public Page<Course> getCoursesByUniversityName(Pageable page,String
    // universityName){
    // return courseRepository.getCoursesByUniversityName(page,universityName)
    // }

    public Course getCourseById(Integer id) {
        logger.info("get Course By Id");
        return courseRepository.getOne(id);
    }

    public Course save(Course course) {
        logger.info("Save Course");
        return courseRepository.save(course);
    }

    public void delete(Course course) {
        logger.info("Delete course");
        courseRepository.delete(course);
    }

}
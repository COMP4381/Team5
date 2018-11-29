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
    private static final Logger logger = Logger.getLogger("ArticleService");
    @Autowired
    CourseRepository courseRepository;

    public Page<Course> getCourses(Pageable page) {
        logger.info("get Courses");
        return courseRepository.findAll(page);
    }

    public Course getById(Integer id) {
        return courseRepository.getOne(id);
    }

    public Course save(Course course) {
        return courseRepository.save(course);
    }

}
package com.comp4382.ass3.assignment3.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comp4382.ass3.assignment3.models.Course;
import com.comp4382.ass3.assignment3.models.Student;
import com.comp4382.ass3.assignment3.models.University;

@Controller
@RestController
@RequestMapping("/universities")
public class UniversityController {

	@GetMapping("/")
	public ArrayList<University> getAllUniversities() {
		ArrayList<University> universities = new ArrayList<University>();
		return universities;
	}

	@GetMapping("/{id}")
	public University getUniversityById(@PathVariable Integer id) {
		if (id != null)
			return new University("name1", "city1");
		else
			return null;
	}

	@PostMapping("/")
	public void addNewUniversity(@RequestBody University university) {
		//
	}

	@PutMapping("/{id}")
	public void editUniversity(@RequestBody University newUniversity, @PathVariable int id) {
		//
	}

	@DeleteMapping("/{id}")
	public void deleteUniversity(@PathVariable int id) {
		//
	}

	@GetMapping("/{uniId}/courses")
	public ArrayList<Course> getAllCourses(@PathVariable int uniId) {
		ArrayList<Course> courses = new ArrayList<>();
		return courses;
	}

	@GetMapping("{uniId}/courses/{id}")
	public Course getCourseById(@PathVariable("uniId") int uniId, @PathVariable("id") int id) {
		return new Course();

	}

	@PostMapping("/{uniId}/courses")
	public void addNewCourse(@PathVariable("uniId") int uniId, @RequestBody Course course) {
		//
	}

	@PutMapping("/{uniId}/courses/{id}")
	public void editCourse(@PathVariable("uniId") int uniId, @RequestBody Course newCourse,
			@PathVariable("id") int id) {
		//
	}

	@DeleteMapping("/{uniId}/courses/{id}")
	public void deleteCourse(@PathVariable("uniId") int uniId, @PathVariable("id") int id) {
		//
	}

	@GetMapping("/{uniId}/students")
	public ArrayList<Course> getAllStudents(@PathVariable("uniId") int uniId) {
		ArrayList<Course> courses = new ArrayList<>();
		return courses;
	}

	@GetMapping("/{uniId}/students/{id}")
	public Course getStudentById(@PathVariable("uniId") int uniId, @PathVariable("id") Integer id) {
		if (id != null)
			return new Course();
		else
			return null;
	}

	@PostMapping("/{uniId}/students")
	public void addNewStudent(@PathVariable("uniId") int uniId, @RequestBody Student student) {
		//
	}

	@PutMapping("/{uniId}/students/{id}")
	public void editStudent(@PathVariable("uniId") int uniId, @RequestBody Student newStudent,
			@PathVariable("id") int id) {
		//
	}

	@DeleteMapping("/{uniId}/students/{id}")
	public void deleteStudent(@PathVariable("uniId") int uniId, @PathVariable("id") int id) {
		//
	}

}

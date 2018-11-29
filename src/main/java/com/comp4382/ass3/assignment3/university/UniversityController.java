package com.comp4382.ass3.assignment3.university;

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

// import com.comp4382.ass3.assignment3.models.Course;
// import com.comp4382.ass3.assignment3.models.Student;
// import com.comp4382.ass3.assignment3.models.University;

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
		// if (id != null)
		// return new University("name1", "city1");
		// else
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

}

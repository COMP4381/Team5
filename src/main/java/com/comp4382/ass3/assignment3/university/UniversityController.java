package com.comp4382.ass3.assignment3.university;

// import java.util.ArrayList;
// import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import com.comp4382.ass3.assignment3.models.Course;
// import com.comp4382.ass3.assignment3.models.Student;
// import com.comp4382.ass3.assignment3.models.University;

@RestController
@RequestMapping("/universities")
public class UniversityController {

	@Autowired
	private UniversityService universityService;

	@GetMapping
	public ResponseEntity<?> getAllUniversities(Pageable page) {
		return Optional.ofNullable(universityService.getUniversities(page))
				.map(universities -> ResponseEntity.ok().body(universities))
				.orElseGet(() -> ResponseEntity.notFound().build());
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getUniversityById(@PathVariable Integer id) {
		return Optional.ofNullable(universityService.getUniversityById(id))
				.map(university -> ResponseEntity.ok().body(university))
				.orElseGet(() -> ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<?> addNewUniversity(@RequestBody University university) {
		University u = universityService.save(university);
		return ResponseEntity.created(null).body(u);

	}

	// @PutMapping("/{id}")
	// public void editUniversity(@RequestBody University newUniversity,
	// @PathVariable int id) {
	// //
	// }

	// @DeleteMapping("/{id}")
	// public void deleteUniversity(@PathVariable int id) {
	// //
	// }

}

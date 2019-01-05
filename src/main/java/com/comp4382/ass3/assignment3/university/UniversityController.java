package com.comp4382.ass3.assignment3.university;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/universities")
public class UniversityController {

	@Autowired
	private UniversityService universityService;

	@ApiOperation(value = "Get all universities")
	@GetMapping
	public ResponseEntity<?> getAllUniversities(Pageable page) {
		return ResponseEntity.ok().body(universityService.getUniversities(page));
	}

	@ApiOperation(value = "Get university By its id")
	@GetMapping("/{id}")
	public ResponseEntity<?> getUniversityById(@PathVariable Integer id) {
		return Optional.ofNullable(universityService.getUniversityById(id))
				.map(university -> ResponseEntity.ok().body(university))
				.orElseGet(() -> ResponseEntity.notFound().build());
	}

	@ApiOperation(value = "Add a new university")
	@PostMapping
	public ResponseEntity<?> addNewUniversity(@RequestBody University university) {
		University u = universityService.save(university);
		return ResponseEntity.created(null).body(u);

	}

	@ApiOperation(value = "Edit an existing university by its id")
	@PutMapping("/{id}")
	public void editUniversity(@RequestBody University newUniversity, @PathVariable int id) {
		//
	}

	@ApiOperation(value = "Delete an existing university by its id")
	@DeleteMapping("/{id}")
	public void deleteUniversity(@PathVariable int id) {
		//
	}

}

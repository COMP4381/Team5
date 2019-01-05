package com.comp4382.ass3.assignment3.user;

import java.util.ArrayList;

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
@RequestMapping("/users")
public class UserController {

	@ApiOperation(value = "Get all users")
	@GetMapping
	public ArrayList<User> getAllUsers() {
		ArrayList<User> users = new ArrayList<User>();
		return users;
	}

	@ApiOperation(value = "Get a user by his/her id")
	@GetMapping("/{id}")
	public User getUserById(@PathVariable Integer id) {
		// if (id != null)
		// return new User("username1", "password1", "example@example.com");
		// else
		return null;
	}

	@ApiOperation(value = "Add a new user")
	@PostMapping
	public void addNewUser(@RequestBody User user) {
		//
	}

	@ApiOperation(value = "Edit an existing user by his/her id")
	@PutMapping("/{id}")
	public void editUser(@RequestBody User newUser, @PathVariable int id) {
		//
	}

	@ApiOperation(value = "Delete an existing user by his/her id")
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable int id) {
		//
	}
}

package com.comp4382.ass3.assignment3.user;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// import com.comp4382.ass3.assignment3.models.User;

@RestController
public class UserController {

	@GetMapping("/users")
	public ArrayList<User> getAllUsers() {
		ArrayList<User> users = new ArrayList<User>();
		return users;
	}

	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable Integer id) {
		// if (id != null)
		// return new User("username1", "password1", "example@example.com");
		// else
		return null;
	}

	@PostMapping("/users")
	public void addNewUser(@RequestBody User user) {
		//
	}

	@PutMapping("/users/{id}")
	public void editUser(@RequestBody User newUser, @PathVariable int id) {
		//
	}

	@DeleteMapping("users/{id}")
	public void deleteUser(@PathVariable int id) {
		//
	}
}

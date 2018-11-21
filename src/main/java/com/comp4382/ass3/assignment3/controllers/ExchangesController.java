package com.comp4382.ass3.assignment3.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.comp4382.ass3.assignment3.models.Exchange;

@RestController
public class ExchangesController {

	@GetMapping("/exchanges")
	public ArrayList<Exchange> getAllExchanges(@RequestParam(value = "university", required = false) String university,
			@RequestParam(value="year",required=false) String year) {
		ArrayList<Exchange> exchanges = new ArrayList<Exchange>();
		return exchanges;
	}

	@GetMapping("/exchanges/{id}")
	public Exchange getUserById(@PathVariable Integer id) {
		if (id != null)
			return new Exchange();
		else
			return null;
	}

	@PostMapping("/exchanges")
	public void addNewExchange(@RequestBody Exchange exchange) {
		//
	}

	@PutMapping("/exchanges/{id}")
	public void editExchange(@RequestBody Exchange newExchange, @PathVariable int id) {
		//
	}

	@DeleteMapping("exchanges/{id}")
	public void deleteExchange(@PathVariable int id) {
		//
	}
}

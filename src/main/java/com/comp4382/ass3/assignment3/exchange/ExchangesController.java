package com.comp4382.ass3.assignment3.exchange;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

// import com.comp4382.ass3.assignment3.models.Exchange;

@RestController
@RequestMapping("/exchanges")
public class ExchangesController {

	@ApiOperation(value = "Get all exchanges")
	@GetMapping
	public ArrayList<Exchange> getAllExchanges(@RequestParam(value = "university", required = false) String university,
			@RequestParam(value = "year", required = false) String year) {
		ArrayList<Exchange> exchanges = new ArrayList<Exchange>();
		return exchanges;
	}

	@ApiOperation(value = "Get exchange by its id")
	@GetMapping("/{id}")
	public Exchange getUserById(@PathVariable Integer id) {
		if (id != null)
			return new Exchange();
		else
			return null;
	}

	@ApiOperation(value = "Add a new exchange")
	@PostMapping
	public void addNewExchange(@RequestBody Exchange exchange) {
		//
	}

	@ApiOperation(value = "Edit an existing exchange by its id")
	@PutMapping("/{id}")
	public void editExchange(@RequestBody Exchange newExchange, @PathVariable int id) {
		//
	}

	@ApiOperation(value = "Edit an existing exchange by its id")
	@DeleteMapping("/{id}")
	public void deleteExchange(@PathVariable int id) {
		//
	}
}

package com.qa.defsspringboot.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.defsspringboot.entities.Supplyer;
import com.qa.defsspringboot.services.SupplyerService;

//Handle incoming HTTP requests and send responses
// uses JSON data
@RestController
@RequestMapping("/supplyer") // adds a prefix to the request URLs
public class SupplyerController {

	private SupplyerService service;

	// Dependency injection
	public SupplyerController(SupplyerService service) {
		// super();
		this.service = service;

	}

	// GET - READ
	// ReadAll
	@GetMapping("/readAll") // localhost:8080/supplyer/readAll
	public List<Supplyer> readAll() {
		return this.service.readAll();
	}

	// ReadByID
	@GetMapping("/readById/{id}") // localhost:8080/supplyer/readById/0
	public Supplyer readById(@PathVariable long id) {
		return this.service.readById(id);
		
	}
	
	// ReadByFirstName
	@GetMapping("/readByFirstName/{firstName}")
	public List<Supplyer> readByFirstName(@PathVariable String firstName) {
		return this.service.readByFirstName(firstName);
	}
		

	
	// POST - CREATE
	@PostMapping("/create") // localhost:8080/supplyer/create
	public Supplyer create(@RequestBody Supplyer supplyer) {
		return this.service.create(supplyer);

	}

	// PUT - UPDATE
	@PutMapping("/update/{id}")
	public Supplyer updateSupplyer(@PathVariable long id, @RequestBody Supplyer supplyer) {
		return this.service.update(id, supplyer);
	}

	// DELETE - DELETE
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable long id) {
		return this.service.delete(id);
	}

}

package com.qa.defsspringboot.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.defsspringboot.entities.Supplyer;
import com.qa.defsspringboot.repos.SupplyerRepos;

@Service
public class SupplyerService {

	private SupplyerRepos repos;

	public SupplyerService(SupplyerRepos repos) {
		this.repos = repos;
	}

	// POST - CREATE
	public Supplyer create(Supplyer supplyer) {
		return this.repos.saveAndFlush(supplyer);
		
	}

	// GET - READ
	public List<Supplyer> readAll() {
		// Return the whole List
		return this.repos.findAll();
	}

	// ReadByID
	public Supplyer readById(long id) {
		return this.repos.findById(id).get();
	}
	
	// ReadByFirstName
	public List<Supplyer> readByFirstName(String firstName) {
		return this.repos.findSupplyerByFirstName(firstName);
	}

	// PUT -UPDATE
	public Supplyer update(long id, Supplyer supplyer) {
		// Get the existing entry
		Supplyer existing = this.repos.findById(id).get();
		// Change the existing entry, using new supplyer object above
		existing.setFirstName(supplyer.getFirstName());
		existing.setLastName(supplyer.getLastName());
		existing.setEmail(supplyer.getEmail());
		// Save the entry back into the Database
		return this.repos.saveAndFlush(existing);
		
	}

	// DELETE - DELETE
	public boolean delete(long id) {
		// Remove Supplyer 
		this.repos.deleteById(id);
		// Check if it still exists
		return !this.repos.existsById(id); // this should be false. so we return true. 
	}

}

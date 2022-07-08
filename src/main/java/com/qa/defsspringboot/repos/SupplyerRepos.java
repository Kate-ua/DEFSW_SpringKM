package com.qa.defsspringboot.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.defsspringboot.entities.Supplyer;


// JpaRepository require both the Entity, and the datatype for the id column. This must be the Object
// So long = Long, int = Integer.
@Repository
public interface SupplyerRepos extends JpaRepository<Supplyer, Long> {
	
	// SELECT * FROM Supplyer s WHERE first_name=firstName
	List<Supplyer>findSupplyerByFirstName(String firstName);
		
//	@Query(value = "SELECT * FROM Supplyer", nativeQuery = true)
//	List<Supplyer> findAllNative();
	
		
}

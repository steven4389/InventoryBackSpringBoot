package com.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.inventory.entities.Providers;


public interface IProvidersRepository extends CrudRepository<Providers, Long> {

	
	public List<Providers> findAll();
	
	//@Modifying
	//@Query(value="SELECT * FROM providers  where provider_id = provider_id;", nativeQuery = true)
	public Providers findByproviderId(@Param("providerId") Long providerId);
	
}

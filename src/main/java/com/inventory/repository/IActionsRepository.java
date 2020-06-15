package com.inventory.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.inventory.entities.Actions;


public interface IActionsRepository extends CrudRepository<Actions, Long> {

	public List<Actions> findAll();
	
}

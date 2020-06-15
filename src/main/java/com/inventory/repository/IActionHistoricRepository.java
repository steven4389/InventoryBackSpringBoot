package com.inventory.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.inventory.entities.ActionsHistoric;


public interface IActionHistoricRepository extends CrudRepository<ActionsHistoric, String> {
	
	public List<ActionsHistoric> findAll();

}

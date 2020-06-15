package com.inventory.services;

import java.util.List;

import com.inventory.entities.ActionsHistoric;

public interface IActionHistoricService {

	public List<ActionsHistoric> findAll();
	
}

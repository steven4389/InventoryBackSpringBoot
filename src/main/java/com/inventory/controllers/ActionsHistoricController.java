package com.inventory.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.entities.ActionsHistoric;
import com.inventory.repository.IActionHistoricRepository;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/actionsHistoric")
public class ActionsHistoricController {
	

	@Autowired
	private IActionHistoricRepository iActionHistoricRepository;

	@GetMapping("/getAllActions")
	public List<ActionsHistoric> getProducts() {
		return iActionHistoricRepository.findAll();
	}	

}

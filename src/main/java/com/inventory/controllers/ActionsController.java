package com.inventory.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.entities.Actions;
import com.inventory.repository.IActionsRepository;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/actions")
public class ActionsController {
	
	
	@Autowired
	private IActionsRepository actionsRepository;

	@GetMapping("/getAllActions")
	public List<Actions> getProducts() {
		return actionsRepository.findAll();
	}	

}

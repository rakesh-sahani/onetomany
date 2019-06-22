/**
 * 
 */
package com.onetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.onetomany.entity.Parent;
import com.onetomany.repository.ParentRepository;

/**
 * @author sumit
 *
 */

@RestController
public class ParentController {

	@Autowired
	ParentRepository parentRepository;
	
	@GetMapping("/view")
	public Iterable<Parent> getParent() 
	{
		return parentRepository.findAll();
	}
	
	@PostMapping("/add")
	public Parent addParent(@RequestBody Parent parent)
	{
		return parentRepository.save(parent);
	}
}

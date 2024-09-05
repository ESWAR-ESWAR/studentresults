package com.results.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.results.model.Results;
import com.results.repository.ResultsRepo;

@RestController
@RequestMapping("/results")
public class ResultsController {
	
	@Autowired
	private ResultsRepo repo;
	
	@PostMapping("/add")
	public Results add(@RequestBody Results model)
	{
		
		Results save = repo.save(model);
		
		return save;
	}
	
	

}

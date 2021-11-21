package com.frey.family.manager.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frey.family.manager.model.FamilyPerson;
import com.frey.family.manager.service.FamilyService;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class FamilyController {

	
	@GetMapping(value="/personlist", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<FamilyPerson> getAllPersons(){
		return  FamilyService.getAllPersons();
	}
	
	@GetMapping(value="/person/{personId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public FamilyPerson getPersonDetails(@PathVariable Long personId){
		return  FamilyService.getPersonDetails(personId);
	}
	
	@PostMapping(value="/addPerson", produces = MediaType.APPLICATION_JSON_VALUE)
	public FamilyPerson addPerson(@RequestBody FamilyPerson person){
		return  FamilyService.addPerson(person);
	}
	
	@PutMapping(value="/updatePerson/{personId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public FamilyPerson updatePerson(@PathVariable Long personId, @RequestBody FamilyPerson person){
		return  FamilyService.updatePerson(personId, person);
	}
	
	@DeleteMapping(value="/deletePerson/{personId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public FamilyPerson deletePerson(@PathVariable Long personId){
		return  FamilyService.deletePerson(personId);
	}
}

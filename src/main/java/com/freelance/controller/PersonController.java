package com.freelance.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.freelance.pojo.Person;

@RestController()
public class PersonController {

	@GetMapping("/person/{id}")
	public List<Person> getPersonaDetail(@PathVariable("id") int id) {
		List<Person> personList = new ArrayList<Person>();
		Person person = new Person();
		if(id==1) {
			person.setFirstName("Venkat1");
			person.setLastName("Sai1");
			person.setAge(42);
			person.setId(id);
		}else if(id==2) {
			person.setFirstName("Venkat2");
			person.setLastName("Sai2");
			person.setAge(41);
			person.setId(id);
		} else {
			if(id==3) {
				person.setFirstName("Venkat3");
				person.setLastName("Sai3");
				person.setAge(42);
				person.setId(id);
			}
		}
		personList.add(person);
		
		return personList;
	}
	
}

package com.freelance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.freelance.pojo.EntityObject;

@RestController()
public class EntityController {

	@GetMapping("/entitt/{id}")
	public EntityObject getentityDetail(@PathVariable(value = "id") int id) {

		EntityObject entity = new EntityObject();

		switch (id) {

		case 1: {
			entity.setId(id);
			entity.setName("Venkat1");
			entity.setDescription("SE");
			break;
		}
		case 2: {
			entity.setId(id);
			entity.setName("Venkat2");
			entity.setDescription("SE");
			break;
		}
		case 3: {
			entity.setId(id);
			entity.setName("Venkat3");
			entity.setDescription("SE");
			break;
		}
		

		case 4: {
			entity.setId(id);
			entity.setName("Sun");
			entity.setDescription("Hotest entity");
			break;
		}
		case 5: {
			entity.setId(id);
			entity.setName("Mercury");
			entity.setDescription("2nd entity");
			break;
		}
		case 6: {
			entity.setId(id);
			entity.setName("Venus");
			entity.setDescription("3rd entity");
			break;
		}
		case 7 : {
			entity.setId(id);
			entity.setName("Mars");
			entity.setDescription("4th entity");
			break;
		}
		case 8 : {
			entity.setId(id);
			entity.setName("Earth");
			entity.setDescription("6th entity");
			break;
		}
		case 9: {
			entity.setId(id);
			entity.setName("Jupiter");
			entity.setDescription("7th entity");
			break;
		}
		case 10: {
			entity.setId(id);
			entity.setName("Saturn");
			entity.setDescription("8th entity");
			break;
		}
		case 11: {
			entity.setId(id);
			entity.setName("Neptune");
			entity.setDescription("9th entity");
			break;
		}
		case 12: {
			entity.setId(id);
			entity.setName("Uranus");
			entity.setDescription("10th entity");
			break;
		}
		default: {
			entity.setId(id);
			entity.setName("XYZ");
			entity.setDescription("Not a  entity");
			break;
		}
		}

		return entity;

	}

}

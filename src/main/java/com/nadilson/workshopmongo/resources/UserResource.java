package com.nadilson.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nadilson.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User maria = new User("1", "Maria Brown", "maria@gmail.com");
		User nadilson = new User("2", "Nadilson", "nadilson.dev@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, nadilson));
		return ResponseEntity.ok().body(list);
	}

}

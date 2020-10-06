package com.sds.desafio.one.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sds.desafio.one.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Alex Sousa", "03830919344", 3000.00, Instant.now(), 0));
		return ResponseEntity.ok().body(list);
	}
}

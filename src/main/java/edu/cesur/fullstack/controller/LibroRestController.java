package edu.cesur.fullstack.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.cesur.fullstack.DTOs.LibroDTO;
import edu.cesur.fullstack.services.LibroService;

@RestController
@RequestMapping("/libros")
public class LibroRestController {

	@Autowired
	LibroService libroService;
	
	@PostMapping("/autor")
	public ResponseEntity<?> crearLibroConAutor(@RequestBody LibroDTO libroDTO) {

		LibroDTO lib = libroService.crearLibroConAutor(libroDTO);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/" + lib.getId())
				.buildAndExpand(lib.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
		
		
	}
}

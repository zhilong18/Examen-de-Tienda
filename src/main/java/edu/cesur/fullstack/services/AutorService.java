package edu.cesur.fullstack.services;

import edu.cesur.fullstack.DTOs.AutorDTO;

public interface AutorService {

	 AutorDTO createAutor(AutorDTO autor);
	 
	 AutorDTO getAutor(Long Id);
}

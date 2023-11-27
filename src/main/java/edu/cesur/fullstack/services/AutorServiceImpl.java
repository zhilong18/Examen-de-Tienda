package edu.cesur.fullstack.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cesur.fullstack.DTOs.AutorDTO;
import edu.cesur.fullstack.mappers.AutorMappers;
import edu.cesur.fullstack.persistence.entities.AutorEntity;
import edu.cesur.fullstack.persistence.repositorie.AutorRepository;

@Service
public class AutorServiceImpl implements AutorService{

	@Autowired
	AutorRepository autorRepository;
	@Autowired
	AutorMappers autorMappers;
	
	@Override
	public AutorDTO createAutor(AutorDTO autor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AutorDTO getAutor(Long Id) {
		 
		Optional<AutorEntity> autorEOP = autorRepository.findById(Id);
		
		if(autorEOP.isPresent()) {
			return autorMappers.toDto(autorEOP.get());
		}
		
		return null;
	}
	
	
}

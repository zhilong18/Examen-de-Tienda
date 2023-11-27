package edu.cesur.fullstack.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cesur.fullstack.DTOs.LibroDTO;
import edu.cesur.fullstack.mappers.LibroMappers;
import edu.cesur.fullstack.persistence.entities.AutorEntity;
import edu.cesur.fullstack.persistence.entities.LibroEntity;
import edu.cesur.fullstack.persistence.repositorie.AutorRepository;
import edu.cesur.fullstack.persistence.repositorie.LibroRepository;
import jakarta.transaction.Transactional;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	LibroRepository libroRepository;
	@Autowired
	LibroMappers libroMappers;
	@Autowired
	AutorRepository autorRepository;

	@Override
	@Transactional
	public LibroDTO crearLibroConAutor(LibroDTO libro) {

		LibroEntity libE = libroMappers.toEntity(libro);

		if (libro.getAutorId() != null) {
			
			AutorEntity autor = autorRepository.findById(libro.getAutorId())
					.orElseThrow(() -> new RuntimeException("autor no encontrado"));

			libE.setAutor(autor);
			
		}
		
		libE = libroRepository.save(libE);

		return libroMappers.toDto(libE);

	}

}

package edu.cesur.fullstack.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import edu.cesur.fullstack.DTOs.AutorDTO;
import edu.cesur.fullstack.persistence.entities.AutorEntity;

@Mapper(componentModel = "spring", uses = {LibroMappers.class})
public interface AutorMappers {

	AutorDTO toDto(AutorEntity autor);
	
	AutorEntity toEntity(AutorDTO autorDTO);
	
	@Mapping(target = "libros", ignore = true)
    AutorDTO toDtoWithoutStudents(AutorDTO curso);
}

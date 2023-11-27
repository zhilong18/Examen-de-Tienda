package edu.cesur.fullstack.DTOs;

import java.math.BigDecimal;

import edu.cesur.fullstack.persistence.entities.AutorEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class LibroDTO {

    private Long id;
    private String titulo;
    private String isbn;
    private BigDecimal precio;
    private Long autorId;

 
}


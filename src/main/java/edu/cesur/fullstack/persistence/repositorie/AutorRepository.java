package edu.cesur.fullstack.persistence.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cesur.fullstack.persistence.entities.AutorEntity;

@Repository
public interface AutorRepository extends JpaRepository<AutorEntity, Long> {

}

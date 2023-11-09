package com.galenos.galenosbackend.repository;

import com.galenos.galenosbackend.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ignac on 08-11-2023.
 */
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}

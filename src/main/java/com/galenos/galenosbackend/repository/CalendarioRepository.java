package com.galenos.galenosbackend.repository;

import com.galenos.galenosbackend.model.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ignac on 25-10-2023.
 */
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {
}

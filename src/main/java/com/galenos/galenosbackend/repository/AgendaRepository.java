package com.galenos.galenosbackend.repository;

import com.galenos.galenosbackend.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ignac on 25-10-2023.
 */
public interface AgendaRepository extends JpaRepository<Agenda, Long> {
}

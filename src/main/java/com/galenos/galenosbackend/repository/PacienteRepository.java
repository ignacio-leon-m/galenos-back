package com.galenos.galenosbackend.repository;

import com.galenos.galenosbackend.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long>
{
}

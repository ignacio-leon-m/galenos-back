package com.galenos.galenosbackend.service;


import com.galenos.galenosbackend.model.Medico;

import java.util.List;

public interface MedicoService {
    List<Medico> getAllMedicos();
    Medico getMedicoById(Long id);
    Medico saveMedico(Medico medico);
    void deleteMedico(Long id);
}

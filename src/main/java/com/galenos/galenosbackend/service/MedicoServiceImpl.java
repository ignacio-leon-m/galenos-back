package com.galenos.galenosbackend.service;

import com.galenos.galenosbackend.model.Medico;
import com.galenos.galenosbackend.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServiceImpl implements MedicoService{

    @Autowired
    private MedicoRepository medicoRepository;

    @Override
    public List<Medico> getAllMedicos() {
        return medicoRepository.findAll();
    }

    @Override
    public Medico getMedicoById(Long id) {
        return (Medico) medicoRepository.findById(id).orElse(null);
    }

    @Override
    public Medico saveMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    @Override
    public void deleteMedico(Long id) {
        medicoRepository.deleteById(id);
    }
}

package com.rancho_smart.ms_alimentacion_suplementos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rancho_smart.ms_alimentacion_suplementos.entity.RegistroAlimentacion;
import com.rancho_smart.ms_alimentacion_suplementos.repository.RegistroAlimentacionRepository;

@Service
public class RegistroAlimentacionService {

    @Autowired
    private RegistroAlimentacionRepository registroAlimentacionRepository;

    public List<RegistroAlimentacion> getAllRegistros() {
        return registroAlimentacionRepository.findAll();
    }

    public Optional<RegistroAlimentacion> getRegistroById(Long id) {
        return registroAlimentacionRepository.findById(id);
    }

    public RegistroAlimentacion saveRegistro(RegistroAlimentacion registro) {
        return registroAlimentacionRepository.save(registro);
    }

    public void deleteRegistro(Long id) {
        registroAlimentacionRepository.deleteById(id);
    }
}

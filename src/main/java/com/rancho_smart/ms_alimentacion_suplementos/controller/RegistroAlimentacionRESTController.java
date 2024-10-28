package com.rancho_smart.ms_alimentacion_suplementos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rancho_smart.ms_alimentacion_suplementos.entity.RegistroAlimentacion;
import com.rancho_smart.ms_alimentacion_suplementos.service.RegistroAlimentacionService;

@RestController
@RequestMapping("/registros-alimentacion")
public class RegistroAlimentacionRESTController {

    @Autowired
    private RegistroAlimentacionService registroAlimentacionService;

    @GetMapping
    public ResponseEntity<List<RegistroAlimentacion>> getAllRegistros() {
        List<RegistroAlimentacion> registros = registroAlimentacionService.getAllRegistros();
        return new ResponseEntity<>(registros, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegistroAlimentacion> getRegistroById(@PathVariable Long id) {
        Optional<RegistroAlimentacion> registro = registroAlimentacionService.getRegistroById(id);
        return registro.map(ResponseEntity::ok)
                       .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<RegistroAlimentacion> createRegistro(@RequestBody RegistroAlimentacion registro) {
        RegistroAlimentacion newRegistro = registroAlimentacionService.saveRegistro(registro);
        return new ResponseEntity<>(newRegistro, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RegistroAlimentacion> updateRegistro(@PathVariable Long id, @RequestBody RegistroAlimentacion registro) {
        if (!registroAlimentacionService.getRegistroById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        registro.setIdRegistroAlimentacion(id);
        RegistroAlimentacion updatedRegistro = registroAlimentacionService.saveRegistro(registro);
        return new ResponseEntity<>(updatedRegistro, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRegistro(@PathVariable Long id) {
        if (!registroAlimentacionService.getRegistroById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        registroAlimentacionService.deleteRegistro(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

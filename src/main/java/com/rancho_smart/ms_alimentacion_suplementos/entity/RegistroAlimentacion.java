package com.rancho_smart.ms_alimentacion_suplementos.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "REGISTRO_ALIMENTACION")
public class RegistroAlimentacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRegistroAlimentacion;

    @ElementCollection
    private List<Long> idAnimal;

    @Column(name = "ID_ALIMENTO")
    private Long idAlimento;

    @Column(name = "ID_LOTE")
    private Long idLote;

    @Column(name = "ID_FINCA")
    private Long idFinca;

    @Column(name = "OBSERVACIONES")
    private String observaciones;

    public RegistroAlimentacion() {
    }

    public RegistroAlimentacion(List<Long> idAnimal, Long idAlimento, Long idLote, Long idFinca, String observaciones) {
        this.idAnimal = idAnimal;
        this.idAlimento = idAlimento;
        this.idLote = idLote;
        this.idFinca = idFinca;
        this.observaciones = observaciones;
    }

    public Long getIdRegistroAlimentacion() {
        return idRegistroAlimentacion;
    }

    public void setIdRegistroAlimentacion(Long idRegistroAlimentacion) {
        this.idRegistroAlimentacion = idRegistroAlimentacion;
    }

    public List<Long> getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(List<Long> idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Long getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(Long idAlimento) {
        this.idAlimento = idAlimento;
    }

    public Long getIdLote() {
        return idLote;
    }

    public void setIdLote(Long idLote) {
        this.idLote = idLote;
    }

    public Long getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(Long idFinca) {
        this.idFinca = idFinca;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
}

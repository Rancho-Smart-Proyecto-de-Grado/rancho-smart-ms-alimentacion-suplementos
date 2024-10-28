package com.rancho_smart.ms_alimentacion_suplementos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rancho_smart.ms_alimentacion_suplementos.entity.RegistroAlimentacion;

@Repository
public interface RegistroAlimentacionRepository extends JpaRepository<RegistroAlimentacion, Long>{

}

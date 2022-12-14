package com.idat.EFLeonardoBravoMicroservicioTurista.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFLeonardoBravoMicroservicioTurista.modelo.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista,Integer>{

}

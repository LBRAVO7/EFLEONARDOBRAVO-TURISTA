package com.idat.EFLeonardoBravoMicroservicioTurista.service;

import java.util.List;

import com.idat.EFLeonardoBravoMicroservicioTurista.dto.TuristaDTO;



public interface TuristaService {
	
	List<TuristaDTO> listar();
	TuristaDTO obtenerId(Integer id);
	void guardar(TuristaDTO turista);

}

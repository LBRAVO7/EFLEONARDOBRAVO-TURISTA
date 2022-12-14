package com.idat.EFLeonardoBravoMicroservicioTurista.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFLeonardoBravoMicroservicioTurista.dto.TuristaDTO;
import com.idat.EFLeonardoBravoMicroservicioTurista.modelo.Turista;
import com.idat.EFLeonardoBravoMicroservicioTurista.repository.TuristaRepository;








@Service
public class TuristaServiceImpl implements TuristaService{

	@Autowired
	private TuristaRepository repository;
	
	@Override
	public List<TuristaDTO> listar() {
		List<TuristaDTO> listadto = new ArrayList<>();
		TuristaDTO dto = null;
		 for (Turista turista : repository.findAll()) {
			 dto= new TuristaDTO();
			 dto.setNomturista(turista.getNombreTurista());
			 dto.setNumcel(turista.getNroCelular());
			 dto.setDirec(turista.getDireccion());
			 dto.setCod(turista.getIdTurista());
			 listadto.add(dto);
		 }
		
		
		return listadto;
	}

	@Override
	public TuristaDTO obtenerId(Integer id) {
		Turista turista = repository.findById(id).orElse(null);
		TuristaDTO dto= new TuristaDTO();
		 dto.setNomturista(turista.getNombreTurista());
		 dto.setNumcel(turista.getNroCelular());
		 dto.setDirec(turista.getDireccion());
		 dto.setCod(turista.getIdTurista());
		 return dto;
	}

	@Override
	public void guardar(TuristaDTO turista) {
		 Turista turis= new Turista();
		 turis.setNombreTurista(turista.getNomturista());
		 turis.setNroCelular(turista.getNumcel());
		 turis.setDireccion(turista.getDirec());
		 turis.setIdTurista(turista.getCod());
		 repository.save(turis);
		
	}




}

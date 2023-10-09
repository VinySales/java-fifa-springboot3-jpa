package com.finalsoccer.fut.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalsoccer.fut.entities.Jogador;
import com.finalsoccer.fut.entities.Liga;
import com.finalsoccer.fut.repositories.JogadorRepository;
import com.finalsoccer.fut.repositories.LigaRepository;

@Service
public class LigaService {
	
	@Autowired
	private LigaRepository repository;
	
	public List<Liga> findAll() {
		return repository.findAll();
	}

	public Liga findById(Long id) {
		Optional<Liga> obj = repository.findById(id);
		return obj.get();
	}

	public Liga insert(Liga obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		Liga obj = findById(id);
		repository.delete(obj);
	}
}

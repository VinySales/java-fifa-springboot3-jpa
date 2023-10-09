package com.finalsoccer.fut.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalsoccer.fut.entities.Jogador;
import com.finalsoccer.fut.repositories.JogadorRepository;

@Service
public class JogadorService {

	@Autowired
	private JogadorRepository repository;

	public List<Jogador> findAll() {
		return repository.findAll();
	}

	public Jogador findById(Long id) {
		Optional<Jogador> obj = repository.findById(id);
		return obj.get();
	}

	public Jogador insert(Jogador obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		Jogador obj = findById(id);
		repository.delete(obj);
	}
}

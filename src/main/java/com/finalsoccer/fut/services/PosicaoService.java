package com.finalsoccer.fut.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalsoccer.fut.entities.Posicao;
import com.finalsoccer.fut.repositories.PosicaoRepository;

@Service
public class PosicaoService {

	@Autowired
	private PosicaoRepository repository;

	public List<Posicao> findAll() {
		return repository.findAll();
	}

	public Posicao findById(Long id) {
		Optional<Posicao> obj = repository.findById(id);
		return obj.get();
	}

	public Posicao insert(Posicao obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		Posicao obj = findById(id);
		repository.delete(obj);
	}
}

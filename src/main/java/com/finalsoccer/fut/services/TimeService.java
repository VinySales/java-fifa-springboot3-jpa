package com.finalsoccer.fut.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalsoccer.fut.entities.Time;
import com.finalsoccer.fut.repositories.TimeRepository;

@Service
public class TimeService {

	@Autowired
	private TimeRepository repository;

	public List<Time> findAll() {
		return repository.findAll();
	}

	public Time findById(Long id) {
		Optional<Time> obj = repository.findById(id);
		return obj.get();
	}

	public Time insert(Time obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		Time obj = findById(id);
		repository.delete(obj);
	}
}

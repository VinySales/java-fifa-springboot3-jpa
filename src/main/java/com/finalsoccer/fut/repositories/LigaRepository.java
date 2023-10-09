package com.finalsoccer.fut.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalsoccer.fut.entities.Jogador;
import com.finalsoccer.fut.entities.Liga;

public interface LigaRepository extends JpaRepository<Liga, Long>{

}

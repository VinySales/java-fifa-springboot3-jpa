package com.finalsoccer.fut.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalsoccer.fut.entities.Jogador;
import com.finalsoccer.fut.entities.Posicao;

public interface PosicaoRepository extends JpaRepository<Posicao, Long>{

}

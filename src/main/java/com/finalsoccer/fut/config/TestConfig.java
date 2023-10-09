package com.finalsoccer.fut.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.finalsoccer.fut.entities.Jogador;
import com.finalsoccer.fut.entities.Liga;
import com.finalsoccer.fut.entities.Posicao;
import com.finalsoccer.fut.entities.Time;
import com.finalsoccer.fut.repositories.JogadorRepository;
import com.finalsoccer.fut.repositories.LigaRepository;
import com.finalsoccer.fut.repositories.PosicaoRepository;
import com.finalsoccer.fut.repositories.TimeRepository;

@Configuration
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private JogadorRepository jogadorRepository;
	
	@Autowired
	private LigaRepository ligaRepository;
	
	@Autowired
	private PosicaoRepository posicaoRepository;
	
	@Autowired
	private TimeRepository timeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Posicao posicaoATA = new Posicao(null, "ATA");
		Posicao posicaoPE = new Posicao(null, "PE");
		Posicao posicaoPD = new Posicao(null, "PD");
		Posicao posicaoMC = new Posicao(null, "MC");
		Posicao posicaoGOL = new Posicao(null, "GOL");
		Posicao posicaoLE = new Posicao(null, "LE");
		Posicao posicaoLD = new Posicao(null, "LD");
		Posicao posicaoMEI = new Posicao(null, "MEI");
		Posicao posicaoVOL = new Posicao(null, "VOL");
		Posicao posicaoZAG = new Posicao(null, "ZAG");
		
		Liga ligaPremiere = new Liga(null, "Premiere");
		Liga ligaSerieA = new Liga(null, "Serie A");
		Liga ligaBundeslLiga = new Liga(null, "BundesLiga");
		Liga ligaLigue1 = new Liga(null, "Ligue 1");
		
		Time timePSG = new Time(null, "PSG", ligaLigue1);
		Time timeArsenal = new Time(null, "Arsenal", ligaPremiere);
		Time timeBayern = new Time(null, "Bayern", ligaBundeslLiga);
		Time timeJuventus = new Time(null, "Juventus", ligaSerieA);
		
		Jogador jogadorMessi = new Jogador(
				null,
				"Lionel Messi", 
				1.68f, 
				70.0f, 
				posicaoMEI,
				85, 
				92, 
				90, 
				38, 
				91, 
				68, 
				timePSG.getLiga(),
				timePSG);
		
		Jogador jogadorNeymar = new Jogador(
				null,
				"Neymar", 
				1.72f, 
				70.0f, 
				posicaoMEI,
				92, 
				98, 
				92, 
				39, 
				96, 
				56, 
				timePSG.getLiga(),
				timePSG);
		
		Jogador jogadorCristianoRonaldo = new Jogador(
				null,
				"Ronaldo", 
				1.85f, 
				78.0f, 
				posicaoPE,
				95, 
				98, 
				97, 
				59, 
				97, 
				88, 
				timeJuventus.getLiga(),
				timeJuventus);
		
		posicaoRepository.saveAll(Arrays.asList(
				posicaoATA,	
				posicaoPE,
				posicaoPD,
				posicaoMC,
				posicaoGOL,
				posicaoLE,
				posicaoLD,
				posicaoMEI,
				posicaoVOL,
				posicaoZAG));
		
		ligaRepository.saveAll(Arrays.asList(
				ligaLigue1, 
				ligaBundeslLiga, 
				ligaSerieA, 
				ligaPremiere));
		
		timeRepository.saveAll(Arrays.asList(
				timeJuventus, 
				timeBayern, 
				timeArsenal, 
				timePSG));
		System.out.println(jogadorCristianoRonaldo.toString());
		jogadorRepository.saveAll(Arrays.asList(
				jogadorCristianoRonaldo, 
				jogadorNeymar, 
				jogadorMessi));
		
	}
}

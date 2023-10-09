package com.finalsoccer.fut.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "jogador")
public class Jogador implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Float altura;
	private Float peso;
	@ManyToOne
	@JoinColumn(name = "posicao_id")
	private Posicao posicao;
	private Integer ritmo;
	private Integer drible;
	private Integer chute;
	private Integer defesa;
	private Integer passe;
	private Integer fisico;
	@ManyToOne
	@JoinColumn(name = "time_id")
	private Time time;
	@ManyToOne
	@JoinColumn(name = "liga_id")
	private Liga liga;
	
	public Jogador() {
	}

	public Jogador(Long id, String nome, Float altura, Float peso, Posicao posicao, Integer ritmo, Integer drible,
			Integer chute, Integer defesa, Integer passe, Integer fisico, Liga liga, Time time) {
		super();
		this.id = id;
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.posicao = posicao;
		this.ritmo = ritmo;
		this.drible = drible;
		this.chute = chute;
		this.defesa = defesa;
		this.passe = passe;
		this.fisico = fisico;
		this.liga = liga;
		this.time = time;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

	public Integer getRitmo() {
		return ritmo;
	}

	public void setRitmo(Integer ritmo) {
		this.ritmo = ritmo;
	}

	public Integer getDrible() {
		return drible;
	}

	public void setDrible(Integer drible) {
		this.drible = drible;
	}

	public Integer getChute() {
		return chute;
	}

	public void setChute(Integer chute) {
		this.chute = chute;
	}

	public Integer getDefesa() {
		return defesa;
	}

	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}

	public Integer getPasse() {
		return passe;
	}

	public void setPasse(Integer passe) {
		this.passe = passe;
	}

	public Integer getFisico() {
		return fisico;
	}

	public void setFisico(Integer fisico) {
		this.fisico = fisico;
	}

	public Liga getLiga() {
		return liga;
	}

	public void setLiga(Liga liga) {
		this.liga = liga;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(altura, chute, defesa, drible, fisico, id, liga, nome, passe, peso, posicao, ritmo, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		return Objects.equals(altura, other.altura) && Objects.equals(chute, other.chute)
				&& Objects.equals(defesa, other.defesa) && Objects.equals(drible, other.drible)
				&& Objects.equals(fisico, other.fisico) && Objects.equals(id, other.id)
				&& Objects.equals(liga, other.liga) && Objects.equals(nome, other.nome)
				&& Objects.equals(passe, other.passe) && Objects.equals(peso, other.peso)
				&& Objects.equals(posicao, other.posicao) && Objects.equals(ritmo, other.ritmo)
				&& Objects.equals(time, other.time);
	}

}

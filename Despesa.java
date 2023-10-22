package br.edu.fatec;

import java.util.Set;

public class Despesa {
	private boolean itsIndividual;
	private String nome;
	private String tipo;
	private double valor;
	private Set<Apartamento> aps;
	
	public boolean isItsIndividual() {
		return itsIndividual;
	}
	
	public void setItsIndividual(boolean itsIndividual) {
		this.itsIndividual = itsIndividual;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Set<Apartamento> getAps() {
		return aps;
	}
	
	public void setAps(Set<Apartamento> aps) {
		this.aps = aps;
	}
}

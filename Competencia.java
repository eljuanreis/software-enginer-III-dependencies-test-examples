package br.edu.fatec;

import java.util.Set;

public class Competencia {
	private int ano;
	private int mes;
	private double totalDesp;
	private Set<Despesa> desps;
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public double getTotalDesp() {
		return totalDesp;
	}
	
	public void setTotalDesp(double totalDesp) {
		this.totalDesp = totalDesp;
	}
	
	public Set<Despesa> getDesps() {
		return desps;
	}
	
	public void setDesps(Set<Despesa> desps) {
		this.desps = desps;
	}
}

package br.edu.fatec;

import java.util.Set;

public class Apartamento {
	private int numero;
	private int qntdQuartos;
	private Proprietario proprietario;
	private Inquilino inquilino;
	private Set<CompetenciaApartamentos> comps;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getQntdQuartos() {
		return qntdQuartos;
	}

	public void setQntdQuartos(int qntdQuartos) {
		this.qntdQuartos = qntdQuartos;
	}
	
	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public Inquilino getInquilino() {
		return inquilino;
	}

	public void setInquilino(Inquilino inquilino) {
		this.inquilino = inquilino;
	}
	
	public Set<CompetenciaApartamentos> getComps() {
		return comps;
	}

	public void setComps(Set<CompetenciaApartamentos> comps) {
		this.comps = comps;
	}
}

package br.edu.fatec;

public class Apartamento {
	private int numero;
	private int qntdQuartos;
	private Proprietario proprietario;
	private Inquilino inquilino;
	
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
}

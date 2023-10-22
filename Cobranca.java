package br.edu.fatec;

public class Cobranca {
	private double valorTotal;
	private Competencia competencias;
	private boolean estaPago;
	private Apartamento ap;

	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public Competencia getCompetencias() {
		return competencias;
	}
	
	public void setCompetencias(Competencia competencias) {
		this.competencias = competencias;
	}
	
	public boolean isEstaPago() {
		return estaPago;
	}
	
	public void setEstaPago(boolean estaPago) {
		this.estaPago = estaPago;
	}
	
	public Apartamento getAp() {
		return ap;
	}
	
	public void setAp(Apartamento ap) {
		this.ap = ap;
	}
}

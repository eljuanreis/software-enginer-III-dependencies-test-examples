package br.edu.fatec;

import java.util.HashSet;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		Inquilino inq = new Inquilino();
		inq.setNome("Inquilino 1");
		
		Proprietario prop = new Proprietario();
		prop.setNome("Prop 1");
		
		//Relação ap com inquilino e proprietario
		Apartamento ap = new Apartamento();
		ap.setInquilino(inq);
		ap.setProprietario(prop);
		ap.setNumero(120);
		
		//Relação de cobrança com despesas
			//aps que serão cobrados
		Set<Apartamento> aps = new HashSet<Apartamento>();
		aps.add(ap);
		
		//Adicionando despesa ao apartamento
		Despesa despesa1 = new Despesa();
		despesa1.setNome("Água");
		despesa1.setValor(250.8f);
		despesa1.setAps(aps);
		
		//Gerando competencia
			//despesas
		Set<Despesa> despesas = new HashSet<Despesa>();
		despesas.add(despesa1);
		
		// gerando uma competencia com uma lista de despesas
		Competencia comp = new Competencia();
		comp.setAno(2023);
		comp.setMes(10);
		comp.setDesps(despesas);
		
		// gerando cobranca para uma competencia
		Cobranca cb = new Cobranca();
		cb.setAp(ap);
		cb.setCompetencias(comp);
		
		// competencias de um apartamentos
		Set<Competencia> competencias = new HashSet<Competencia>();
		competencias.add(comp);
		
		CompetenciaApartamentos cap = new CompetenciaApartamentos();
		cap.setAps(aps);
		cap.setCompetencias(competencias);
	}
}

package br.ufg.inf.leilao.servico;

import br.ufg.inf.leilao.dominio.Lance;
import br.ufg.inf.leilao.dominio.Leilao;

public class Avaliador {

	private double maiorDeTodos = Double.NEGATIVE_INFINITY;
	private double menorDeTodos = Double.POSITIVE_INFINITY;

	public double getMaiorLance() {
		return maiorDeTodos;
	}
	
	public double getMenorLance() {
		return menorDeTodos;
	}

	public void avalia(Leilao leilao) {
		for(Lance lance : leilao.getLances()) {
			if (lance.getValor() > maiorDeTodos ) maiorDeTodos = lance.getValor();
			if (lance.getValor() < menorDeTodos ) menorDeTodos = lance.getValor();
		}
	}
}

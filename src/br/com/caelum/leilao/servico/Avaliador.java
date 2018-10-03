package br.com.caelum.leilao.servico;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;

/**
 * Servi�o de avalia��o de lance.
 * 
 * @author iago.bruno
 *
 */
public class Avaliador {

	private double maiorDeTodos = Double.NEGATIVE_INFINITY;
	private double menorDeTodos = Double.POSITIVE_INFINITY;

	/**
	 * Classifica o maior e menor valor de lance
	 * 
	 * @param leilao
	 *            {@link Leilao} que ser� avaliado.
	 */
	public void avalia(Leilao leilao) {

		for (Lance lance : leilao.getLances()) {
			if (lance.getValor() > maiorDeTodos) {
				maiorDeTodos = lance.getValor();
			}

			if (lance.getValor() < menorDeTodos) {
				menorDeTodos = lance.getValor();
			}
		}
	}

	public double getMaiorLance() {
		return maiorDeTodos;
	}

	public double getMenorLance() {
		return menorDeTodos;
	}

}

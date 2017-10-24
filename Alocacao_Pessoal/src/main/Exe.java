package main;

import model.Genetico;
import model.Populacao;

public class Exe {

	public static void main(String args[]) {

		Populacao populacao = new Populacao();

		Genetico genetico = new Genetico(populacao);

		int geracao = 0;
		int taxaRep = 0;
		do {
			System.out.println(geracao + "° Geração");

			genetico.cruzamento(genetico.selecao());

			/*
			 * for (int j = 0; j < genetico.getPopulacao().getLista().size();
			 * j++) { System.out.print(); }
			 */

			System.out.print("\n");

			geracao++;

			for (int i = 0; i < genetico.getPopulacao().getLista().size(); i++) {
				int valorRep = genetico.menorValor().get(0).getCoeficiente();

				if (genetico.getPopulacao().getLista().get(i).getCoeficiente() == valorRep) {
					taxaRep++;
				}

			}

		} while (geracao < 5000);
		System.out.println(genetico.menorValor());
		if (taxaRep > 10)
			System.out.println("Menor valor coeficiente estagnado " /*(rept.: " + taxaRep + "): */
					+ genetico.menorValor().get(0).getCoeficiente());
		else
			System.out.println("Menor valor do coeficiente: " + genetico.menorValor().get(0).getCoeficiente());
	}

}

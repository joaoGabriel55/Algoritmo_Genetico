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

			genetico.selecao();
			genetico.cruzamento();

			/*
			 * for (int j = 0; j < genetico.getPopulacao().getLista().size(); j++) {
			 * System.out.print(); }
			 */

			System.out.print("\n");

			geracao++;

			for (int i = 0; i < genetico.menorValor(genetico.getBetterList()).size(); i++) {
				int valorRep = genetico.menorValor(genetico.getBetterList()).get(0).getCoeficiente();

				if (genetico.menorValor(genetico.getBetterList()).get(i).getCoeficiente() == valorRep) {
					taxaRep++;
				}

			}

		} while (geracao < 100);
		System.out.println(genetico.menorValor(genetico.getBetterList()));
		if (taxaRep > 10)
			System.out.println("Menor valor coeficiente estagnado " /* (rept.: " + taxaRep + "): */
					+ genetico.menorValor(genetico.getBetterList()).get(0).getCoeficiente());
		else
			System.out.println("Menor valor do coeficiente: " + genetico.menorValor(genetico.getBetterList()).get(0).getCoeficiente());
	}

}

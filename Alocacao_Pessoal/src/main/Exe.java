package main;

import model.Genetico;
import model.Populacao;

public class Exe {

	public static void main(String args[]) {

		// Individuo[] individuos = new Individuo[4];

		Populacao populacao = new Populacao();

		Genetico genetico = new Genetico(populacao);

		int geracao = 0;
		do {
			genetico.cruzamento(genetico.selecao());
			System.out.println("\n" + genetico.getPopulacao().getLista().toString());
			geracao++;
		} while (geracao <= 10);
	}

}

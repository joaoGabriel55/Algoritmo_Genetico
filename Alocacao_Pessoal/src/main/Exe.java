package main;

import java.util.Arrays;

import model.Genetico;
import model.Individuo;
import model.Populacao;

public class Exe {

	public static void main(String args[]) {

		Individuo individuo = new Individuo();

		// Individuo[] individuos = new Individuo[4];

		Populacao populacao = new Populacao();

		Genetico genetico = new Genetico(populacao);
		genetico.selecao();
		genetico.cruzamento();

		Individuo individuo2 = new Individuo(individuo.getTurno());

		for (int i = 0; i < 100; i++) {
			genetico.selecao();
			genetico.cruzamento();

			System.out.println("\n"+genetico.getPopulacao().getLista().toString() + "\n Seleção: " + genetico.getBetterList());
		}
	}

}

package main;

import model.Genetico;
import model.Individuo;
import model.Populacao;

public class Exe {

	public static void main(String args[]) {

		Individuo individuo = new Individuo();
		individuo.avaliar();

		Populacao populacao = new Populacao();

		Genetico genetico = new Genetico(populacao);
		System.out.println(genetico.selecao());
		System.out.println(genetico.getBetterList());

	}

}

package model;

import java.util.ArrayList;
import java.util.Random;

public class Genetico implements Comparable<Genetico> {

	private Random random = new Random();
	private Individuo individuo;
	private Individuo[] individuo2;
	private Populacao populacao = new Populacao();

	public Genetico(Populacao populacao) {
		super();
		this.populacao.iniciarPopulacao(10);
	}

	public ArrayList<Individuo> selecao() {

		ArrayList<Individuo> betterList = new ArrayList<>();
		
		int pos1;
		int pos2;

		final int tam = populacao.getLista().size();

		for (int i = 0; i < tam; i++) {
			
			pos1 = random.nextInt(tam);
			pos2 = random.nextInt(tam);

			int populacao1 = populacao.getLista().get(pos1).getCoeficiente();
			int populacao2 = populacao.getLista().get(pos2).getCoeficiente();

			if (populacao1 < populacao2) {
				betterList.add(populacao.getIndividuo(pos1));
			} else {
				betterList.add(populacao.getIndividuo(pos1));

			}

		}

		// Collections.sort(betterList);

		System.out.println("\nSele��o: " + betterList);

		return betterList;
	}

	public Individuo[] cruzamento(ArrayList<Individuo> list) {

		int[] aux = new int[6];
		int[] aux2 = new int[6];

		Individuo[] individuos = new Individuo[4];
		individuos = populacao.getLista().toArray(new Individuo[populacao.getLista().size()]);

		int[] gene1 = individuos[0].getTurno();
		int[] gene2 = individuos[1].getTurno();
		int[] gene3 = individuos[2].getTurno();
		int[] gene4 = individuos[3].getTurno();

		aux[0] = gene1[0];
		gene1[0] = gene2[0];
		gene2[0] = aux[0];

		aux[1] = gene1[1];
		gene1[1] = gene2[1];
		gene2[1] = aux[1];

		aux2[0] = gene3[0];
		gene3[0] = gene4[0];
		gene4[0] = aux2[0];

		aux2[1] = gene3[1];
		gene3[1] = gene4[1];
		gene4[1] = aux2[1];

		Individuo[] filhos = new Individuo[4];

		filhos[0] = new Individuo(gene1);
		filhos[1] = new Individuo(gene2);
		filhos[2] = new Individuo(gene3);
		filhos[3] = new Individuo(gene4);

		return filhos;

	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public Populacao getPopulacao() {
		return populacao;
	}

	public void setPopulacao(Populacao populacao) {
		this.populacao = populacao;
	}

	@Override
	public int compareTo(Genetico genetico) {
		// TODO Auto-generated method stub

		return this.individuo.compareTo(genetico.individuo);

	}

	public Individuo[] getIndividuo2() {
		return individuo2;
	}

	public void setIndividuo2(Individuo[] individuo2) {
		this.individuo2 = individuo2;
	}

}

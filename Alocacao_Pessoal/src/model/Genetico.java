package model;

import java.util.ArrayList;
import java.util.Random;

public class Genetico {
	
	private Random random = new Random();
	private Individuo individuo;
	private Populacao populacao = new Populacao();
	private ArrayList<Integer> betterList = new ArrayList<>();

	public ArrayList<Integer> selecao() {
		
		final int tam = 10; 
		
		populacao.iniciarPopulacao(tam);		

		for (int i = 0; i < 10; i++) {

			int populacao1 = populacao.getLista().get(random.nextInt(tam)).getCoeficiente();
			int populacao2 = populacao.getLista().get(random.nextInt(tam)).getCoeficiente();

			if (populacao1 < populacao2) {
				betterList.add(populacao1);
			} else {
				betterList.add(populacao2);

			}

		}

		return betterList;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public Individuo getIndividuo() {
		return individuo;
	}

	public void setIndividuo(Individuo individuo) {
		this.individuo = individuo;
	}

	public Populacao getPopulacao() {
		return populacao;
	}

	public void setPopulacao(Populacao populacao) {
		this.populacao = populacao;
	}

	public ArrayList<Integer> getBetterList() {
		return betterList;
	}

	public void setBetterList(ArrayList<Integer> betterList) {
		this.betterList = betterList;
	}

}

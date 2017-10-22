package model;

import java.util.ArrayList;
import java.util.Collections;

public class Populacao {

	private ArrayList<Individuo> lista = new ArrayList<Individuo>();

	public ArrayList<Individuo> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Individuo> lista) {
		this.lista = new ArrayList<>();
	}

	public void iniciarPopulacao(int tamPop) {
		for (int i = 0; i < tamPop; i++) {
			lista.add(new Individuo());
		}
		ordenarPopulacao();
	}

	// ordenar populacao (ordem crescente)
	public void ordenarPopulacao() {
		Collections.sort(lista);
		
		System.out.print("População:");
		System.out.print("[");
		for (Individuo individuo : lista) {
			System.out.print(individuo.getCoeficiente() + ", ");
		}
		System.out.print("]");
	}

	public Individuo getIndividuo(int pos) {
		return lista.get(pos);
	}

	// coloca um individuo na proxima posicao disponivel da populacao
	public void setIndividuo(Individuo individuo) {
		lista.add(individuo);

	}

	// numero de individuos existentes na populacao
	public int getNumIndividuos() {
		return lista.size();
	}

}

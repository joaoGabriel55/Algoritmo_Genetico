package model;

import java.util.Arrays;
import java.util.Random;

public class Individuo implements Comparable<Individuo> {

	private Random random = new Random();

	// Cada posiçao tera um valor aleatorio de enfemeros
	private int[] turno = new int[6];
	private Double coeficiente;

	public Individuo() {
		this.setTurno();
		avaliar();
	}

	public void mutacao(int posicao) {
		if (posicao == 0)
			this.setTurno();
		else if (posicao == 1)
			this.setTurno();

	}

	// cria um individuo a partir de genes definidos
	public Individuo(int[] genes) {

		// testa se deve fazer mutacao
		if (random.nextInt() <= 5) {
			int posAleatoria = random.nextInt(genes.length); // define gene que
																// sera mutado
			mutacao(posAleatoria);
		}
		avaliar();
	}

	public void avaliar() {
		coeficiente = (this.turno[0] + this.turno[1] + this.turno[2] + (1.5 * this.turno[3]) + (2 * this.turno[4])
				+ this.turno[5]);
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public int[] getTurno() {
		return turno;
	}

	public void setTurno() {
		this.turno[0] = 50 + random.nextInt(100);
		this.turno[1] = 60 + random.nextInt(100);
		this.turno[2] = 50 + random.nextInt(100);
		this.turno[3] = 40 + random.nextInt(100);
		this.turno[4] = 30 + random.nextInt(100);
		this.turno[5] = 20 + random.nextInt(100);
	}

	public Double getCoeficiente() {
		return coeficiente;
	}

	public void setCoeficiente(Double coeficiente) {
		this.coeficiente = coeficiente;
	}

	@Override
	public int compareTo(Individuo individuo) {
		// TODO Auto-generated method stub
		return this.coeficiente.compareTo(individuo.coeficiente);

	}

	@Override
	public String toString() {
		return "Individuo [random=" + random + ", turno=" + Arrays.toString(turno) + ", coeficiente=" + coeficiente
				+ "]";
	}

}

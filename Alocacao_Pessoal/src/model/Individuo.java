package model;

import java.util.Arrays;
import java.util.Random;

public class Individuo implements Comparable<Individuo> {

	private Random random = new Random();

	// Cada posiçao tera um valor aleatorio de enfemeros
	private int[] turno = new int[6];
	private Integer coeficiente;

	public Individuo() {
		this.setTurno();
		avaliar();
	}

	public void mutacao(int posicao) {
		if (posicao == 0)
			this.setTurno1();
		else if (posicao == 1)
			this.setTurno2();
		else if (posicao == 2)
			this.setTurno3();
		else if (posicao == 3)
			this.setTurno4();
		else if (posicao == 4)
			this.setTurno5();
		else if (posicao == 5)
			this.setTurno6();
	}

	// cria um individuo a partir de genes definidos
	public Individuo(int[] genes) {

		// testa se deve fazer mutacao
		if (random.nextInt() <= 5) {
			int posAleatoria = random.nextInt(genes.length); // define gene que
			turno = genes;													// sera mutado
			mutacao(posAleatoria);
		}
		avaliar();
	}

	public void avaliar() {
		coeficiente = (int) (this.turno[0] + this.turno[1] + this.turno[2] + (1.5 * this.turno[3]) + (2 * this.turno[4])
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

	public void setTurno1() {
		this.turno[0] = 50 + random.nextInt(100);
	}

	public void setTurno2() {
		this.turno[1] = 60 + random.nextInt(100);
	}

	public void setTurno3() {
		this.turno[2] = 50 + random.nextInt(100);
	}

	public void setTurno4() {
		this.turno[3] = 40 + random.nextInt(100);
	}

	public void setTurno5() {
		this.turno[4] = 30 + random.nextInt(100);
	}

	public void setTurno6() {
		this.turno[5] = 20 + random.nextInt(100);
	}

	public int getCoeficiente() {
		return coeficiente;
	}

	public void setCoeficiente(int coeficiente) {
		this.coeficiente = coeficiente;
	}

	@Override
	public int compareTo(Individuo individuo) {
		// TODO Auto-generated method stub
		return this.coeficiente.compareTo(individuo.coeficiente);

	}

	@Override
	public String toString() {
		return "Individuo [turno=" + Arrays.toString(turno) + ", coeficiente=" + coeficiente
				+ "]";
	}

}

package main;

import model.Genetico;
import model.Individuo;

public class Exe {
	
	public static void main (String args[]){
		
		Individuo individuo = new Individuo();
		individuo.avaliar();
		
		Genetico genetico = new Genetico();
		System.out.println(genetico.selecao());
		System.out.println(genetico.getBetterList());
		
		
		
	}

}

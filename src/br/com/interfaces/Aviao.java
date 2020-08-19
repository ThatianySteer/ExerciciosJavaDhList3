package br.com.interfaces;

public class Aviao implements Voador {

	private int horasDeVoo;
	
	@Override
	public void voar() {
		this.horasDeVoo += 13;
		
		
		System.out.println("Estou voando como um avião voa, e tenho "+this.horasDeVoo+" horas de voo!");

	}

}

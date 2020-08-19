package br.com.interfaces;

public class SuperMan implements Voador {
	
	private int experiencia;
	
	@Override
	public void voar() {
		experiencia += 3;
		System.out.println("Estou voando com um campeão!");
	

	}

}

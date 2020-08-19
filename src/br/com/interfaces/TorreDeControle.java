package br.com.interfaces;

public class TorreDeControle {

	private Voador voadores[];
	
	TorreDeControle(Voador lista[]){
		this.voadores = lista;
	}
	
	public void voemTodos() {
		
		for (int i = 0; i < voadores.length; i++) {
			voadores[i].voar();
		}
	}
}

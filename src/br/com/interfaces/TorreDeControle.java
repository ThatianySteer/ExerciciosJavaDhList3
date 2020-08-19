package br.com.interfaces;

public class TorreDeControle {

	private Voador voadores[];
	
	TorreDeControle(Voador listaDeVoadores[]){
		this.voadores = listaDeVoadores;
	}
	
	public void voemTodos() {
		
		for (int i = 0; i < voadores.length; i++) {
			voadores[i].voar();
		}
	}
}

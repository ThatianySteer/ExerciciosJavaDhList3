package br.com.interfaces;

public class Main {

	public static void main(String[] args) {
	
		Pato pato = new Pato();
		Aviao aviao = new Aviao();
		SuperMan superMan = new SuperMan ();
		
		Voador listaDeVoadores[] = new Voador[3];
		
		listaDeVoadores[0] = pato;
		listaDeVoadores[1] = aviao;
		listaDeVoadores[2] = superMan;
		
		TorreDeControle torreDeControle = new TorreDeControle(listaDeVoadores);
		
		torreDeControle.voemTodos();
		
		for (int i = 0; i<20; i++) {
			torreDeControle.voemTodos();
		}

		
	}

}

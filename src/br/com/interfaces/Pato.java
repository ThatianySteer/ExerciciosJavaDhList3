package br.com.interfaces;

public class Pato implements Voador	{

	private int energia = 100;
		
	@Override
	public void voar() {
			
		if(energia > 0) {
			energia -= 5;
			
			System.out.println("Estou voando como um Duck! =)");
		}else {
			System.out.println("Não tenho energia para voar.");
		}
	}

}

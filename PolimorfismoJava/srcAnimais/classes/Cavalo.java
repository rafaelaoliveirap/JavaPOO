package classes;

import interfaces.AcoesAnimais;

public class Cavalo extends Animal implements AcoesAnimais {

	@Override
	public void emiteSom() {
		System.out.println("O " + getNome() + " relinchou.");
		
	}

	@Override
	public void correr() {
		System.out.println("O " + getNome() + " correu.");
		
	}

	@Override
	public void subirEmArvores() {                       
		
	}
	@Override
	public void mostraNomeIdade() {
		System.out.println("O cavalo " + getNome() + " possui " + getIdade() + " anos." );
		
	}
	
}

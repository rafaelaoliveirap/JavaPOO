package classes;

import interfaces.AcoesAnimais;

public class Cachorro extends Animal implements AcoesAnimais {

	@Override
	public void emiteSom() {
		System.out.println("O cachorro " + getNome() + " latiu.");
		
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
		System.out.println("O " + getNome() + " possui " + getIdade() + " anos." );
		
	}
	
	
}

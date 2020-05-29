package classes;

import interfaces.AcoesAnimais;

public class BichoPregui�a extends Animal implements AcoesAnimais{
	

	@Override
	public void emiteSom() {
		System.out.println("O " + getNome() + " emitiu um som!");
	}
	
	// n�o ser� utilizado
	@Override
	public void correr() {
		
	}

	@Override
	public void subirEmArvores() {
		System.out.println("O " + getNome() + " subiu na �rvore. ");
	}
	@Override
	public void mostraNomeIdade() {
		System.out.println("O bicho pregui�a " + getNome() + " possui " + getIdade() + " anos." );
		
	}
}

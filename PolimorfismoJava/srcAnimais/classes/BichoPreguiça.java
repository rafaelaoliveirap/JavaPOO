package classes;

import interfaces.AcoesAnimais;

public class BichoPreguiça extends Animal implements AcoesAnimais{
	

	@Override
	public void emiteSom() {
		System.out.println("O " + getNome() + " emitiu um som!");
	}
	
	// não será utilizado
	@Override
	public void correr() {
		
	}

	@Override
	public void subirEmArvores() {
		System.out.println("O " + getNome() + " subiu na árvore. ");
	}
	@Override
	public void mostraNomeIdade() {
		System.out.println("O bicho preguiça " + getNome() + " possui " + getIdade() + " anos." );
		
	}
}

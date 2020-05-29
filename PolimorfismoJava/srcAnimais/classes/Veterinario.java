package classes;

import interfaces.AcoesAnimais;

public class Veterinario implements AcoesAnimais{

	public void examinar(Cachorro cachorro) {
		System.out.print("O cachorro "); 
		this.emiteSom();
	}
	public void examinar(BichoPregui�a bichoPregui�a) {
		System.out.print("O bicho pregui�a "); 
		this.emiteSom();
	}
	public void examinar(Cavalo cavalo) {
		System.out.print("O cavalo "); 
		this.emiteSom();
	}
	@Override
	public void emiteSom() {
		System.out.println("emitiu som, pois est� sendo examinado!");
	}

	@Override
	public void correr() {
		
	}

	@Override
	public void subirEmArvores() {
		
	}

	@Override
	public void mostraNomeIdade() {
		
	}
	
	
	
}

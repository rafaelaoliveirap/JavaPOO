package Main;

import classes.BichoPreguiça;
import classes.Cachorro;
import classes.Cavalo;
import classes.Veterinario;

public class Main {

	public static void main(String[] args) {
	
	Cachorro cachorro = new Cachorro();
	cachorro.setNome("Chico");
	cachorro.setIdade(3);
	cachorro.mostraNomeIdade();
	cachorro.correr();
	cachorro.emiteSom();
	
	
	BichoPreguiça bichoPreguica = new BichoPreguiça();
	bichoPreguica.setNome("Lulu");
	bichoPreguica.setIdade(4);
	bichoPreguica.mostraNomeIdade();
	bichoPreguica.subirEmArvores();
	bichoPreguica.emiteSom();
	
	Cavalo cavalo = new Cavalo();
	cavalo.setNome("Neve");
	cavalo.setIdade(5);
	cavalo.mostraNomeIdade();
	cavalo.correr();
	cavalo.emiteSom();
	
	Veterinario veterinario = new Veterinario();
	veterinario.examinar(cachorro);
	veterinario.examinar(bichoPreguica);
	veterinario.examinar(cavalo);
	
	}

}

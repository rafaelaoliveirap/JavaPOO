package Main;

import Model.Carro;
import Model.Moto;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setCor("amarelo");
		carro.setDiracaoAutomatica(true);
		carro.setMarca("Renaut");
		carro.setNumeroDePortas(4);
		carro.setContemAlarme(false);
		carro.setCurva(true);
		carro.setVelocidade(80);
		
		carro.capotamento();
		
		carro.OCarroContemAlarme();
		
		carro.desligar();
		
		
		System.out.println("-----------------------------------------");
		
		Moto moto = new Moto();
		moto.setCor("amarelo");
		moto.setDiracaoAutomatica(false);
		moto.setMarca("Honda");
		moto.setContemBau(true);
		moto.setCurva(false);
		moto.setVelocidade(80);
		
		moto.capotamento();
		
		moto.AMotoContemBau();
		moto.ligar();
	}

}

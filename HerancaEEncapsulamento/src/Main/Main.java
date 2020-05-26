package Main;

import Model.Aeronave1;
import Model.Aeronave2;

public class Main {
	public static void main(String[] args) {
		Aeronave1 aeronave1 = new Aeronave1();
		aeronave1.setMarca("Airbus");
		aeronave1.setCor("branca");
		aeronave1.setTamanho("grande");
		aeronave1.setTurbo(true);
		
		aeronave1.decolar();
		aeronave1.ejetarBanco();
		
		
		System.out.println("-----------------------------------------");
		
		
		Aeronave2 aeronave2 = new Aeronave2();
		aeronave2.setMarca("Gol");
		aeronave2.setCor("azul");
		aeronave2.setTamanho("pequena");
		aeronave2.setBancosDeCouro(true);
		
		aeronave2.pousar();
		aeronave2.abrirPortaParaCima();
		
	}
	
	
}

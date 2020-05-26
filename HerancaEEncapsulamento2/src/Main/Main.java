package Main;

import Model.Fogao;
import Model.Geladeira;

public class Main {
	public static void main(String[] args) {
		Fogao fogao = new Fogao();
		fogao.setaGas(false);
		fogao.setCor("preto");
		fogao.setMarca("Brastemp");
		fogao.setNome("Fogão");
		fogao.setNumeroDeBocas(4);
		
		fogao.MostraTipoFogao();
		
		System.out.println("----------------------------------------------------");
		
		Geladeira geladeira = new Geladeira();
		geladeira.setCor("branca");
		geladeira.setMarca("Consul");
		geladeira.setNome("Geladeira");
		geladeira.setContemFreezer(true);
		geladeira.setTamanho("grande");
		
		geladeira.gelarBebidas();
		
	}
}

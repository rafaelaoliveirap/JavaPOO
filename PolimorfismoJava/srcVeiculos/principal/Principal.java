package principal;

import classes.Caminhao;
import classes.CarroPasseio;
import classes.Veiculos;

public class Principal {
	public static void main(String[] args) {
		Veiculos veiculo = new Veiculos();
		
		veiculo.entradaDeDados();
		veiculo.mostrarDados();
		
		System.out.println();
		System.out.println();
		
		CarroPasseio carro = new CarroPasseio();
		carro.entradaDeDadosCarroPasseio();
		carro.mostrarDadosCarroPasseio();
		
		System.out.println();
		System.out.println();
		
		Caminhao caminhao = new Caminhao();
		caminhao.entradaDeDadosCaminhao();
		caminhao.mostraDadosCaminhao();
		
		
	}
	
}

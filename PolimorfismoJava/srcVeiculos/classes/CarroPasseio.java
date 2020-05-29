package classes;

import java.util.Scanner;

public class CarroPasseio extends Veiculos {
	Scanner entrada = new Scanner (System.in);
	private String cor;
	private String modelo;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void entradaDeDadosCarroPasseio() {
		System.out.print("Entre com a cor do carro: ");
		this.cor = entrada.nextLine();
		System.out.print("Entre com o modelo do carro: ");
		this.modelo = entrada.nextLine();
	}
	public void mostrarDadosCarroPasseio() {
		System.out.println("O carro do modelo " + this.modelo + " é da cor " + this.cor);

	}

}

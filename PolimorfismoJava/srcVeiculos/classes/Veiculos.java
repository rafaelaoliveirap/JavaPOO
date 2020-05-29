package classes;

import java.util.Scanner;

public class Veiculos {
	Scanner entrada = new Scanner (System.in);
	private double peso;
	private double velocidadeMaxima;
	private double preco;
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void entradaDeDados() {
		System.out.println("Entre com o peso do veículo: ");
		this.peso = entrada.nextDouble();
		System.out.println("Entre com a velocidade máxima do veículo: ");
		this.velocidadeMaxima = entrada.nextDouble();
		System.out.println("Entre com o preco do veículo: ");
		this.preco = entrada.nextDouble();
	}
	public void mostrarDados() {
		System.out.printf(" O veículo pesa %.2f kg, a sua velocidade máxima é %.0f km/h e custa %.2f reais.",this.peso, this.velocidadeMaxima, this.preco);
	}
	
	

}

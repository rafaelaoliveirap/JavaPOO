package classes;

import java.util.Scanner;

public class Caminhao {
	Scanner entrada = new Scanner (System.in);
	
	private double cargaMaxima;
	private double alturaMaxima;
	private double comprimento;
	
	public double getCargaMaxima() {
		return cargaMaxima;
	}
	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	public double getAlturaMaxima() {
		return alturaMaxima;
	}
	public void setAlturaMaxima(double alturaMaxima) {
		this.alturaMaxima = alturaMaxima;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public void entradaDeDadosCaminhao() {
		System.out.print("Entre com a carga m�xima caminh�o");
		this.cargaMaxima= entrada.nextDouble();
		System.out.print("Entre com a altura m�xima do caminh�o: ");
		this.alturaMaxima = entrada.nextDouble();
		System.out.print("Entre com o comprimento do caminh�o: ");
		this.comprimento = entrada.nextDouble();
	}
	public void mostraDadosCaminhao() {
		System.out.printf(" O caminh�o tem carga m�xima de %.2f kg, a sua altura m�xima � de %.0f metros e possui comprimento de %.2f metros.",this.cargaMaxima
				, this.alturaMaxima, this.comprimento);

	}
	
}

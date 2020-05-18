package TrabalhandoComClasses;

import java.util.Scanner;

public class UtilizandoClasseComDigitacao {
	public static void main(String[] args) {
		String cor="";
		String marca="";
		
		//instanciando a classe carro
		//Criando objeto carroAluno
		Carro carroAluno = new Carro ("","");
				
		//instanciando a classe Scanner
		Scanner entrada = new Scanner (System.in);
		
		//recebendo dados do usuário
		System.out.print("Informe a cor do seu veículo: ");
		cor = entrada.nextLine();
		carroAluno.setCor(cor);
		
		System.out.println("Informe a marca do seu veículo:");
		marca = entrada.nextLine();
		carroAluno.setMarca(marca);
		
		carroAluno.mostraMarcaECor();
		
	}

}

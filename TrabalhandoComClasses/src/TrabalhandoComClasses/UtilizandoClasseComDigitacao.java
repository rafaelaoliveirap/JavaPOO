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
		
		//recebendo dados do usu�rio
		System.out.print("Informe a cor do seu ve�culo: ");
		cor = entrada.nextLine();
		carroAluno.setCor(cor);
		
		System.out.println("Informe a marca do seu ve�culo:");
		marca = entrada.nextLine();
		carroAluno.setMarca(marca);
		
		carroAluno.mostraMarcaECor();
		
	}

}

package ContaCorrente;

import java.util.Scanner;

public class Nubank {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String numeroAgencia="";
		int numeroConta=0;
		double saldoAtual=0;
		String operacao="";
		double valor=0;
		
		ContaCorrente Nubank = new ContaCorrente (numeroAgencia, numeroConta, saldoAtual, operacao, valor);
		
		System.out.println("Digite a sua agencia: ");
		numeroAgencia = entrada.next();
		Nubank.setNumeroAgencia(numeroAgencia);
		
		System.out.println("Digite o número da sua conta: ");
		numeroConta = entrada.nextInt();
		Nubank.setNumeroConta(numeroConta);
		
		System.out.println("Digite o seu saldo atual: ");
		saldoAtual = entrada.nextDouble();
		Nubank.setSaldoAtual(saldoAtual);
		
		Nubank.operacao();
		Nubank.mostrarDados();

	}
}

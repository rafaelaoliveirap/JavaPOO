package ContaCorrente;

import java.util.Scanner;

public class ContaCorrente {
	private String numeroAgencia;
	private int numeroConta;
	private double saldoAtual;
	private String operacao;
	private double valor;
	
	public ContaCorrente (String numeroAgencia, int numeroConta, double saldoAtual, String operacao, double valor) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldoAtual = saldoAtual;
		this.operacao = operacao;
		this.valor = valor;
	}
	
	Scanner entrada = new Scanner (System.in);
	
	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	public void operacao() {
		System.out.println("Insira o número da operação que deseja realizar:  \n 1) saque \n 2) depósito?");
		int operacao = entrada.nextInt();
		
		if(operacao == 1) {
			System.out.println("Digite o valor a ser sacado: ");
			valor = entrada.nextDouble();
			this.saque();
		}else 
				if(operacao == 2) {
					System.out.println("Digite o valor a ser depositado: ");
					valor = entrada.nextDouble();
					this.deposito();
					
				}else{
						System.out.println("Digite uma opção válida:");
						this.operacao();
						
					}
	}
	public void deposito() {
		saldoAtual = saldoAtual + valor;
	}
	public void saque() {
		saldoAtual = saldoAtual - valor;
	}
	public void mostrarDados() {
		System.out.println("Agencia: " + getNumeroAgencia());
		System.out.println("Conta: " + getNumeroConta());
		System.out.println("Saldo atual: " + getSaldoAtual());
	}
	
}

package IdadePessoa;
import java.util.Scanner;

public class Pessoa {
	private String nome;
	private int dataAtual;
	private int dataNascimento;
	private int idade;
	private int idadeAtual;
		
	public Pessoa(String nome, int dataAtual, int dataNascimento, int idade, int idadeAtual) {
		this.nome = nome;
		this.dataAtual = dataAtual;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
		this.idadeAtual = idadeAtual;
	}
	Scanner entrada = new Scanner (System.in);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDataAtual() {
		return dataAtual;
	}

	public void setDataAtual(int dataAtual) {
		this.dataAtual = dataAtual;
	}

	public int getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdadeAtual() {
		return idadeAtual;
	}

	public void setIdadeAtual(int idadeAtual) {
		this.idadeAtual = idadeAtual;
	}

	public void nome() {
		System.out.print("Digite o seu nome: ");
		nome = entrada.next();
		System.out.println("Olá " + nome);
	}
	public void calculaIdade() { 
		
		int idadeAtual =0;
		int dataAtual = 2020;
		
		System.out.println("Digite o ano de nascimento: ");
		dataNascimento = entrada.nextInt();
		
		idadeAtual = dataAtual - dataNascimento;
		System.out.println("Sua idade é: " + idadeAtual);
		
	}
	public void CalculaIdade50Anos() {
		
		int idade50Anos = 2070 - getDataNascimento();
		System.out.println("Sua idade daqui 50 anos será: " + idade50Anos);
		
	}
	
	
}

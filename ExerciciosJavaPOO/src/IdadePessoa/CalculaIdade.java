package IdadePessoa;

import java.util.Scanner;

public class CalculaIdade {
	public static void main(String[] args) {
		String nome = "";
		int dataAtual = 0;
		int dataNascimento = 0;
		int idade = 0;		
		int idadeAtual=0;
		
		Pessoa idadePessoa = new Pessoa("", dataAtual, dataNascimento, idade, idadeAtual);
		
		
		idadePessoa.nome();
		idadePessoa.calculaIdade();
		idadePessoa.CalculaIdade50Anos();	
		
		
	}
}

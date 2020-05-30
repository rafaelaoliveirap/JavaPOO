package main;

import java.util.List;
import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {
		// Inserindo os valores nas variáveis aula1, aula2 e aula3
		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		 // Instanciando a arrayList
		ArrayList<String> aulas = new ArrayList<>();
		
		//Adicionando o valor da variavel aula1 no arrayList
		aulas.add(aula1); 
		
		//Adicionando o valor da variavel aula2 no arrayList
		aulas.add(aula2); 
		
		//Adicionando o valor da variavel aula3 no arrayList
		aulas.add(aula3); 
		
		//imprimindo todo o conteúdo do o array aulas
		System.out.println(aulas); 
		
		//imprimindo o tamanho da lista aulas
		System.out.println(aulas.size()); 
		
		//cuidado! <= faz sentido aqui? 
		
		//não está correto, não existe posição 3 no array, teria que ser usado o <
		
		//Implementando o for para acessar todos os indices da lista
		for (int i = 0; i < aulas.size(); i++) {
		
			// Imprime no console o valor do indice i
			System.out.println("Aula: " + aulas.get(i)); 
			
		}

	}

}
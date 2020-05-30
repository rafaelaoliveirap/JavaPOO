package Main;

	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Set;

	public class MinhasCollections {
		public static void main(String[] args) {
			
			//Instanciando o ArrayList e dando o nome de minhaLista
			List<Integer> minhaLista = new ArrayList<Integer>(); 
			
			// Adicionando o valor 1 ao minhaLista
			minhaLista.add(1); 
			
			// Adicionando o valor 2 ao minhaLista
			minhaLista.add(2); 
			
			// Adicionando o valor 2 ao minhaLista 
			minhaLista.add(2);
			
			// Percorre a minhaLista
			for (Integer listaElementos : minhaLista) { 
				
				
			// Imprime no console os valores armazenados no array da minhaLista
				System.out.println(listaElementos); 
				
			}
			// pula uma linha, imprime tra�os na tela e pula outra linha para separar da pr�xima impress�o
			System.out.println("\n--------------------\n");
			
			// Instanciamento do HashSet chamado meuSet;
			Set<Integer> meuSet = new HashSet<Integer>(); 
			
			// Adicionando o valor 1 ao meuSet
			meuSet.add(1); 
			
			// Adicionando o valor 2 ao meuSet
			meuSet.add(2);
			
			 // Adicionando o valor 3 ao meuSet
			meuSet.add(3); 
			
			// Adicionando o valor 1 ao meuSet
			meuSet.add(1); //Ser� ignorado, pois o HashSet n�o adiciona dois valores iguais
			
			// Cria��o do Iterator para listar todos os meus dados de forma corrida
			Iterator<Integer> iMeuSet = meuSet.iterator(); 
			// Implementa��o do while para a impress�o de todos os valores do array
			while(iMeuSet.hasNext()){  
				// Imprime na tela 
				System.out.println(iMeuSet.next()); 
			}
		}
	}
}

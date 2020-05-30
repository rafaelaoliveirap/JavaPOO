package Main;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.*;

import Model.Telefone;

public class Main{

	public static void main(String[] args) {
		//0 = celular 1 = residencial 2 = comercial
		
		List <Telefone> listaTelefones = new ArrayList <Telefone> ();
		Telefone telefone1 = new Telefone("94005-3652", 0);
		Telefone telefone2 = new Telefone("99802-2568", 1);
		Telefone telefone3 = new Telefone("90521-4972", 2);
		Telefone telefone4 = new Telefone("95465-9843", 2);
		
		listaTelefones.add(telefone1);
		listaTelefones.add(telefone2);
		listaTelefones.add(telefone3);
		listaTelefones.add(telefone4);
		
		Telefone telefone;
		
		Iterator<Telefone> listaOrganizada = listaTelefones.iterator();
		while(listaOrganizada.hasNext()) {
			telefone= listaOrganizada.next();
			System.out.println("Telefone: " + telefone.getNumeroTelefone() + " \nTipo:" + telefone.getTipoTelefone());
			
		}
		

	}

}

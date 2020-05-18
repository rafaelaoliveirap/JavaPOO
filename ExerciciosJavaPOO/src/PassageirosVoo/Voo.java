package PassageirosVoo;

import java.util.Scanner;

public class Voo {
	private int numeroVoo;
	private String data;
	private String horario;
	private int numeroPassageiros;
	

	public Voo(int numeroVoo, String data, String horario, int numeroPassageiros) {
			this.numeroVoo = numeroVoo;
			this.data = data;
			this.horario = horario;
			this.numeroPassageiros = numeroPassageiros;
	}
	
	Scanner entrada = new Scanner (System.in);

	public int getNumeroVoo() {
		return numeroVoo;
	}

	public void setNumeroVoo(int numeroVoo) {
		this.numeroVoo = numeroVoo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}

	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}
	public void voo() {
		System.out.println("\"Insira o número correspondente ao seu voo \n1) 101 \n2) 102 \n3)103");
		numeroVoo = entrada.nextInt();
		
		if(numeroVoo ==1 | numeroVoo==2 | numeroVoo==3) {
			System.out.println("Você selecionou um voo válido!");
		}else {
			System.out.println("Digite um número válido correspondente ao voo: ");
			this.voo();
		}
	}
	public void maximoPassageiros() {
		
		do {
			int voo101=0, voo102=0, voo103=0;
			
			System.out.println("Insira o horário:");
			horario = entrada.next();
			
			System.out.println("Insira o número de passageiros: ");
			numeroPassageiros = entrada.nextInt();

			if(numeroVoo == 1) {
				voo101 ++;
			}else
				if(numeroVoo == 2) {
					voo102++;
				}else
					if(numeroVoo == 3) {
						voo103++;
					}else {
						System.out.println("Digite um número de voo válido!");
						
					}

	
		}while(numeroPassageiros<51);
		System.out.println(numeroPassageiros);
	}
	
	
}

package TrabalhandoComClasses;

public class Carro {
	//atributos
		private String cor;
		private String marca;
		// fim dos atributos
		
		//método construtor
		public Carro(String cor, String marca) {
			this.cor = cor;
			this.marca = marca;
		}
		//fim do método construtor

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}
		 
		public void mostraMarca() {
			System.out.println("A marca do carro é " + getMarca());
		}
		public void mostraMarcaECor() {
			System.out.println("O carro é da marca " + getMarca() + 
					" e possui a cor " + getCor());
		}
		
		
}
 
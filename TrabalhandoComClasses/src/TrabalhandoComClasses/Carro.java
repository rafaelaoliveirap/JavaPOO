package TrabalhandoComClasses;

public class Carro {
	//atributos
		private String cor;
		private String marca;
		// fim dos atributos
		
		//m�todo construtor
		public Carro(String cor, String marca) {
			this.cor = cor;
			this.marca = marca;
		}
		//fim do m�todo construtor

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
			System.out.println("A marca do carro � " + getMarca());
		}
		public void mostraMarcaECor() {
			System.out.println("O carro � da marca " + getMarca() + 
					" e possui a cor " + getCor());
		}
		
		
}
 
package TrabalhandoComClasses;

public class UtilizandoClasse {

	public static void main(String[] args) {
		String cor ="azul";
		String marca = "Renaut";
		
		Carro meuCarro = new Carro(cor, marca);
		meuCarro.mostraMarcaECor();
		
		 // mudando a cor
		
		meuCarro.setCor("amarelo");
		meuCarro.mostraMarcaECor();
		
		// mudando a marca
		marca="Fiat";
		meuCarro.setMarca(marca);
		meuCarro.mostraMarcaECor();

	}

}

package Model;

public class AeronaveMae {
	private String tamanho;
	private String cor;
	private String marca;
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
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
	
	public void decolar() {
		System.out.println("A aeronave " + this.marca + " irá decolar!");
	}
	public void pousar() {
		System.out.println("A areonave " + this.marca + " irá pousar!");
	}
	
	
}

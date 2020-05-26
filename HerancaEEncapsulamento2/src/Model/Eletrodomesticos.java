package Model;

public class Eletrodomesticos {
	private String cor;
	private String tamanho;
	private Integer voltagem;
	private String marca;
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public Integer getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(Integer voltagem) {
		this.voltagem = voltagem;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void ligar() {
		System.out.println("A sua " + this.nome + "está ligada!");
	}
	
}

package Model;

public class Veiculo {
	
	private String marca;
	
	private String cor;
	private Integer numeroDeRodas;
	private Boolean direcaoAutomatica;
	private Integer velocidade;
	private Boolean curva;
	
	public Boolean getCurva() {
		return curva;
	}
	public void setCurva(Boolean curva) {
		this.curva = curva;
	}
	public void setDirecaoAutomatica(Boolean direcaoAutomatica) {
		this.direcaoAutomatica = direcaoAutomatica;
	}
	public Integer getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Integer getNumeroDeRodas() {
		return numeroDeRodas;
	}
	public void setNumeroDeRodas(Integer numeroDeRodas) {
		this.numeroDeRodas = numeroDeRodas;
	}
	public Boolean getDirecaoAutomatica() {
		return direcaoAutomatica;
	}
	public void setDiracaoAutomatica(Boolean direcaoAutomatica) {
		this.direcaoAutomatica = direcaoAutomatica;
	}
	
	public void possuiDirecaoAutomatica() {
		if(direcaoAutomatica) {
			System.out.println("O seu veículo possuí direção automática!");
		}else {
			System.out.println("O seu veículo possuí direção manual!");
		}
	}
	
	public void ligar() {
		System.out.println("O veiculo da " + this.marca + " está ligado");
	}
	
	public void desligar() {
		System.out.println("O veiculo da " + this.marca + " está desligado");
	}
	
	public void acelerar() {
		System.out.println("O veículo está acelerando!");
	}
	
	public void desacelerar() {
		System.out.println("O veiculo está desacelerando!");
	}
	
	public void capotamento() {
		if(this.velocidade>70 && this.curva==true) {
			System.out.println("O veiculo irá capotar, reduza a velocidade!");
		}else {
			System.out.println("Você está dentro da velocidade segura!");
		}
	}
}

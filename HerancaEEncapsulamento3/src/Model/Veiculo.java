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
			System.out.println("O seu ve�culo possu� dire��o autom�tica!");
		}else {
			System.out.println("O seu ve�culo possu� dire��o manual!");
		}
	}
	
	public void ligar() {
		System.out.println("O veiculo da " + this.marca + " est� ligado");
	}
	
	public void desligar() {
		System.out.println("O veiculo da " + this.marca + " est� desligado");
	}
	
	public void acelerar() {
		System.out.println("O ve�culo est� acelerando!");
	}
	
	public void desacelerar() {
		System.out.println("O veiculo est� desacelerando!");
	}
	
	public void capotamento() {
		if(this.velocidade>70 && this.curva==true) {
			System.out.println("O veiculo ir� capotar, reduza a velocidade!");
		}else {
			System.out.println("Voc� est� dentro da velocidade segura!");
		}
	}
}

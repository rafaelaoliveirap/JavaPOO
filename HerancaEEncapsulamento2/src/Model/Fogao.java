package Model;

public class Fogao extends Eletrodomesticos {
	private Integer numeroDeBocas;
	private Boolean temForno;
	private Boolean aGas;
	
	
	
	public Integer getNumeroDeBocas() {
		return numeroDeBocas;
	}
	public void setNumeroDeBocas(Integer numeroDeBocas) {
		this.numeroDeBocas = numeroDeBocas;
	}
	public Boolean getTemForno() {
		return temForno;
	}
	public void setTemForno(Boolean temForno) {
		this.temForno = temForno;
	}
	public Boolean getaGas() {
		return aGas;
	}
	public void setaGas(Boolean aGas) {
		this.aGas = aGas;
	}
	
	
	public void MostraTipoFogao() {
		if(aGas) {
			System.out.println("O Fog�o " + getMarca() + " a g�s!");
		}else {
			System.out.println("Fog�o "  + getMarca() + " � el�trico");
		}
	}
	
	
}

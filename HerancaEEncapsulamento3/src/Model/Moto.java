package Model;

public class Moto extends Veiculo {
	private Boolean contemBau;

	public Boolean getContemBau() {
		return contemBau;
	}

	public void setContemBau(Boolean contemBau) {
		this.contemBau = contemBau;
	}
	
	public void AMotoContemBau() {
		if(contemBau) {
			System.out.println("A moto da marca " + getMarca() + " cont�m ba�!");
		}else {
			System.out.println("A moto da marca " + getMarca() + " n�o cont�m ba�!");
		}
	}
}

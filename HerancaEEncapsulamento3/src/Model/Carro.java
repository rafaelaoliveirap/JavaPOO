package Model;

public class Carro extends Veiculo{
	private Integer numeroDePortas;
	private Boolean contemAlarme;
	
	public Integer getNumeroDePortas() {
		return numeroDePortas;
	}
	public void setNumeroDePortas(Integer numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	public Boolean getContemAlarme() {
		return contemAlarme;
	}
	public void setContemAlarme(Boolean contemAlarme) {
		this.contemAlarme = contemAlarme;
	}
	
	public void OCarroContemAlarme() {
		if(contemAlarme) {
			System.out.println("O carro da marca " + getMarca() + " contém alarme!");
		}else {
			System.out.println("O carro da marca " + getMarca() + " não contém alarme!");
		}
	}

}

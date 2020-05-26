package Model;

public class Aeronave2 extends AeronaveMae{
	private Boolean bancosDeCouro;
	
	public void abrirPortaParaCima() {
		System.out.println("A aeronave " + getMarca() + " abriu a porta para cima!");
	}

	public Boolean getBancosDeCouro() {
		return bancosDeCouro;
	}

	public void setBancosDeCouro(Boolean bancosDeCouro) {
		this.bancosDeCouro = bancosDeCouro;
	}
	
}

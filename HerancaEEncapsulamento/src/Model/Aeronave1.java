package Model;

public class Aeronave1 extends AeronaveMae {
	private Boolean turbo;
	
	public void ejetarBanco() {
		System.out.println("A aeronave " + getMarca() + " teve o banco ejetado!");
	}

	public Boolean getTurbo() {
		return turbo;
	}

	public void setTurbo(Boolean turbo) {
		this.turbo = turbo;
	}
	
}

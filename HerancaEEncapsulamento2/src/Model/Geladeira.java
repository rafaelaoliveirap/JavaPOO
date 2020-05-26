package Model;

public class Geladeira extends Eletrodomesticos {
	
	private Boolean contemFreezer;

	public Boolean getContemFreezer() {
		return contemFreezer;
	}

	public void setContemFreezer(Boolean contemFreezer) {
		this.contemFreezer = contemFreezer;
	}
	
	public void gelarBebidas() {
		System.out.println("Modo gelar bebidas ativado!");
	}
	
}

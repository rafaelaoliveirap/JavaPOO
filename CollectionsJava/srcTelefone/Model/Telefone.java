package Model;

public class Telefone {
	private String numeroTelefone;
	private Integer tipoTelefone;
	
	
	public Telefone(String numeroTelefone, Integer tipoTelefone) {
		this.numeroTelefone = numeroTelefone;
		this.tipoTelefone = tipoTelefone;
	}
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNrTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	public Integer getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(Integer tipoTelefone) {
	 switch (tipoTelefone) {
	case 1: {
		System.out.println("telefone celular");
		break;
	}
	case 2: {
		System.out.println("telefone residencial");
		break;
	}
	case 3: {
		System.out.println("telefone comercial");
		break;
	}
	default:
		throw new IllegalArgumentException("número inválido");
	}
	}
	
}

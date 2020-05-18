package ExerciciosJavaPOO;

public class CartaoDeVisita {
	public static void main(String[] args) {
		String nome = "";
		String email = "";
		String telefone = "";
		
		Pessoa cartaoDeVisita = new Pessoa(nome, email, telefone);
		cartaoDeVisita.setNome("Maria dos Santos");
		cartaoDeVisita.setEmail("maria@gmal.com");
		cartaoDeVisita.setTelefone("2255-9999");
		cartaoDeVisita.mostraNomeEmailETelefone();
		
	}
}

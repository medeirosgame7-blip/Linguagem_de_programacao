package biblioteca;

public class Editora {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.trim().isEmpty()) {
			this.nome = nome;
		} else {
			System.out.println("Editora inválido!!!");
		}

	}
}

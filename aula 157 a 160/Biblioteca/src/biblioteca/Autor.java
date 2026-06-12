package biblioteca;

public class Autor {
	private String nome;
	private String nacionalidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.trim().isEmpty()) {
			this.nome = nome;
		}
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		if (nacionalidade != null && !nacionalidade.trim().isEmpty()) {
			this.nacionalidade = nacionalidade;
		}
	}

}

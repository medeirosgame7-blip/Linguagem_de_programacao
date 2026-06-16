package biblioteca;

public class Livro {

	private String titulo;
	private int anoLancamento;
	private Autor autor;
	private Editora editora;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {

		if (titulo != null && !titulo.trim().isEmpty()) {
			this.titulo = titulo;
		}
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {

		if (anoLancamento <= 0) {
			System.out.println("Ano de lançamento inválido!!!");
		} else {
			this.anoLancamento = anoLancamento;
		}
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		if (autor != null) {
			this.autor = autor;
		} else {
			System.out.println("autor inválido!!!");
		}
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		if (editora != null) {
			this.editora = editora;
		} else {
			System.out.println("autor inválido!!!");
		}
	}

	public void mostrarAutor() {
		if (autor == null) {
			System.out.println("Erro: o autor não pode ser nulo.");
		} else {
			System.out.println(
					"Livro " + titulo + " foi escrito por " + autor.getNome() + " Da Editora " + editora.getNome());
		}
	}

}

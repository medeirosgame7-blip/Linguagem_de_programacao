package biblioteca;

public class Livro {

	private String titulo;
	private int anoLancamento;
	private Autor autor;

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

		if (anoLancamento > 0) {
			this.anoLancamento = anoLancamento;
		}
	}

	public void mostrarAutor() {
		if (autor == null) {
			System.out.println("Erro: o autor não pode ser nulo.");
		} else {
			System.out.println("Livro " + titulo + " foi escrito por " + autor.getNome());
		}
	}

}

package biblioteca;

public class App {

	public static void main(String[] args) {
		Autor autor = new Autor();
		Livro livro = new Livro();
		Editora editora = new Editora();

		editora.setNome("Garnier");

		autor.setNome("Machado de Assis");
		autor.setNacionalidade("Brasileiro");

		livro.setTitulo("Dom Casmurro");
		livro.setAnoLancamento(1899);
		livro.setAutor(autor);
		livro.setEditora(editora);

		livro.mostrarAutor();

	}

}

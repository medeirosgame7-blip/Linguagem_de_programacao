package biblioteca;

public class App {

	public static void main(String[] args) {
		Livro livro = new Livro();
		Autor autor = new Autor();
		
		autor.setNome("Machado de Assis");
		autor.setNacionalidade("Brasileiro");
		
		livro.setTitulo("Dom Casmurro");
		livro.setAnoLancamento(1899);
		livro.setAutor(autor);
		
		livro.mostrarAutor();

	}

}

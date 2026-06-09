package redeSocial;

public class App {

	public static void main(String[] args) {
		
         Usuario usuario1 = new Usuario();
         
         usuario1.nome = "ana";
         usuario1.idade = 17;
         usuario1.cidade = "Valença";
         
         usuario1.mostrarPerfil();
         
         postagem postagem1 = new postagem();
         
         postagem1.texto = "Estudando Java hoje!";
         postagem1.curtidas = 15;
         postagem1.autor = "Ana";
         
         postagem1.mostrarPostagem();
	}

}

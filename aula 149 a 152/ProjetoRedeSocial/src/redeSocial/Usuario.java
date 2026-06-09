package redeSocial;

public class Usuario {
   String nome;
   int idade;
   String cidade;
   
   void mostrarPerfil() {
	   System.out.println("   PERFIL   ");
	   System.out.println("User Name: " + nome);
	   System.out.println("Years: " + idade);
	   System.out.println("Cidade: " + cidade);
   }
}

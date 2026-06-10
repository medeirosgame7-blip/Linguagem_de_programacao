package loja;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Produto produto = new Produto();
       
       produto.setNome("PCgamer");
       produto.setPreco(7500.00);
       produto.setQuantidadeEstoque(10);
       
       
       System.out.println("======= Dados de Produtos ========");
       System.out.println("Nome: "+ produto.getNome());
       System.out.println("Preço: R$"+ produto.getPreco());
       System.out.println("Quantidade em estoque: "+ produto.getQuantidadeEstoque());
       
       System.out.println();
       
       Cliente Cliente = new Cliente();
       
       Cliente.setNome("Davi");
       Cliente.setIdade(19);
       Cliente.setEmail("marineparlano1817@gmail.com");
       
       System.out.println("======= Dados do cliente ========");
       System.out.println("Nome do cliente: "+ Cliente.getNome());
       System.out.println("Idade: "+ Cliente.getIdade());
       System.out.println("Quantidade em estoque: "+ Cliente.getEmail());
       
       System.out.println();
	}

}

package mercado;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item item = new Item();
		
		
		item.setDescricao("Caixa de tomate");
		item.setPreco(35.96);
		item.setQuantidade(50);
		 
	        System.out.println("========== Dados do produto ==========");
	       System.out.println("Descrição: "+ item.getDescricao());
	       System.out.println("Preço: R$"+ item.getPreco());
	       System.out.println("Quantidade em estoque: "+ item.getQuantidade() + " unidades");
	       
	       System.out.println();
	       
	   Fornecedor fornecedor = new Fornecedor();
	   
	   
	    fornecedor.setNome("Davi");
		fornecedor.setTelefone("2297841963");
		fornecedor.setCidade("Macaé");
		 
	       System.out.println("========= Dados do comprador ========");
	       System.out.println("Nome: "+ fornecedor.getNome());
	       System.out.println("Telefone: "+ fornecedor.getTelefone());
	       System.out.println("Cidade: "+ fornecedor.getCidade());
	       
	       System.out.println();
	}  

}

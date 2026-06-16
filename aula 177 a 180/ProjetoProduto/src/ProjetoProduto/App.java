package ProjetoProduto;

public class App {

	public static void main(String[] args) {
		Produto produto1 = new Produto();
		Produto produto2 = new Produto("Macbook", 12000.00);
		Produto produto3 = new Produto("ps4", 2780.00, 10);

		produto1.exibirProduto();
		produto2.exibirProduto();
		produto3.exibirProduto();

	}

}

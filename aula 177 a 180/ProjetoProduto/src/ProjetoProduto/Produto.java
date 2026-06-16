package ProjetoProduto;

public class Produto {

	private String nome;
	private double preco;
	private int estoque;

	public Produto() {
		this.nome = "Produto padrão";
		this.preco = 0.0;
		this.estoque = 0;

	}

	public Produto(String nome, double preco) {
		this.nome = "Macbook";
		this.preco = 12000.00;
		this.estoque = 0;

	}

	public Produto(String nome, double preco, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = 10;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && nome.trim().isEmpty()) {
			this.nome = nome;
		}
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco > 0) {
			this.preco = preco;
		}
		System.out.println("Preço inválido!!!");
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		if (estoque > 0) {
			this.estoque = estoque;
		}
		System.out.println("Estoque inválido!!!");
	}

	public void exibirProduto() {
		System.out.println("nome: " + nome);
		System.out.println("preço: " + preco);
		System.out.println("estoque: " + estoque);
	}
}

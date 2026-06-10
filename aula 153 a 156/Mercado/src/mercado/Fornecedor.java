package mercado;

public class Fornecedor {

	
	private String nome;
	private String telefone;
	private String cidade;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome.isEmpty()) {
			System.out.println("Nome inválido!!!");
		} else {
			this.nome = nome;
		}
	}
	
	
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		if (telefone.isEmpty()) {
			System.out.println("Telefone inválido!!!");
		} else {
			this.telefone = telefone;
		}
	}
	
	
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		if (cidade.isEmpty()) {
			System.out.println("Cidade inválida!!!");
		} else {
			this.cidade = cidade;
		}
	}
}

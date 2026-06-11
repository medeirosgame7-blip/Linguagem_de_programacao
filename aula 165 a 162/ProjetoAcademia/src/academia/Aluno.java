package academia;

public class Aluno extends Pessoa {
	private String plano;
	

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		if (!plano.trim().isEmpty()) {
			this.plano= plano;
	    } else {
		   System.out.println("Nenhum plano optado!!!");  
	    }
	  }

	public void exibirAluno() {
		System.out.println("Nome do aluno: " + getNome());
		System.out.println("Sua idade: " + getIdade());
		System.out.println("Plano: " + getPlano());
		
	}

}

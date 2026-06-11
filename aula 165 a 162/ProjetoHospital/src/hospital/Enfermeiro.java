package hospital;

public class Enfermeiro extends Profissional {

	private String setor;

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		if (!setor.trim().isEmpty() && setor != null) {
			this.setor = setor;
		} else {
			System.out.println("Setor inválido!!!");
		}
	
	}
	
	@Override
	public void exibirDados() {
		  System.out.println("nome: "+ getNome());
	      System.out.println("Registro: "+ getRegistro());
	      System.out.println("Turno: "+ getTurno());
	      System.out.println("Setor hospitalar: "+ getSetor());
	}
	
}

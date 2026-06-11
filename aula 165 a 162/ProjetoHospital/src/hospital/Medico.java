package hospital;

public class Medico extends Profissional {

	private String especialidade;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		if (!especialidade.trim().isEmpty() && especialidade != null) {
			this.especialidade = especialidade;
					
		} else {
			System.out.println("Especialidade inválida!!!");
		}
	
	}
	    @Override
		public void exibirDados() {
			
		      System.out.println("nome: "+ getNome());
		      System.out.println("Registro: "+ getRegistro());
		      System.out.println("Turno: "+ getTurno());
		      System.out.println("Especialidade: "+ getEspecialidade());
		}	
	
}

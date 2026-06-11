package hospital;

public class Profissional {
  
	private String nome;
	private String registro;
	private String turno;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (!nome.trim().isEmpty() && nome != null) {
			this.nome = nome;			
		} else {
			System.out.println("Nome inválido!!!");
		}
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		if (!registro.trim().isEmpty() && registro != null) {
		this.registro = registro;
		}
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		if (!turno.trim().isEmpty() && turno != null) {
			this.turno = turno;			
		}
	} 
	
	
	public void exibirDados() {
		System.out.println("Nome: "+ getNome());
		System.out.println("Registro: "+ getRegistro());
		System.out.println("Turno: "+ getTurno());
		
	}
	
}

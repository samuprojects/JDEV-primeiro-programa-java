package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
		
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	
	@Override
	public double salario() {
		return 1800.80 * 0.9;
	}
	
	/* Com a implementação do controle de acesso por parâmetro houve ganho com a redução de atributos... */
	/* ... na Classe secretário, reduzindo o código, mantendo a consistência, pois em sistemas ... */
	/* ... mais complexos (Hibernate) poderia haver uma quebra da estrutura dessa classe ... */
	/* ... por causa da criação de atributos no banco sem necessidade e jogamos a responsabilidade para interface*/
	@Override
	public boolean autenticar(String login, String senha) {
		return login.equals("admin") && senha.equals("admin");
	}	
			
}

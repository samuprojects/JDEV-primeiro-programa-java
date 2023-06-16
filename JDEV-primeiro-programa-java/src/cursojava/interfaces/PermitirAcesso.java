package cursojava.interfaces;

public interface PermitirAcesso {
	
	/* Outra forma de implementar o controle de acesso agora usando construtores */
	public boolean autenticar(String login, String senha); 
	public boolean autenticar(); 

}

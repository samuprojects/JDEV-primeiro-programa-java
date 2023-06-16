package cursojava.interfaces;

/* Essa interface será o nosso contrato de autenticação */
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha); /* alterado método para deixar mais restritivo */
}

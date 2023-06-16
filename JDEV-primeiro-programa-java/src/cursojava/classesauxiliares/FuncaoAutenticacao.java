package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/* Classe responsável por receber somente quem tem o "contrato" da interface PermitirAcesso */
/* e chamar o método autenticar - esse é um padrão em muito dos frameworks e núcleo do Java */
/* Liberação do Diretor usando os conceitos do Polimorfismo cada um com seu acesso individual */
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao (PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}

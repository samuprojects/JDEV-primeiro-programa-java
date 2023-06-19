package curso.java.excecao;

@SuppressWarnings("serial")
public class ExcecaoProcessarNota extends Exception {
	
	public ExcecaoProcessarNota(String erro) {
		super("Problema! Erro no processamento das notas do aluno " + erro);
	}

}

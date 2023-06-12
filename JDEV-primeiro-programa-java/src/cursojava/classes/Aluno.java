package cursojava.classes;

public class Aluno { /* A classe com visibilidade public pôde ser criada na Primeira ClasseJava */

	/* para acessar podemos alterar para public apenas de forma didática como a seguir */
	public String nome;
	public int idade;
	String dataNascimento; /* porém os demais atributos não podem ser acessados por que estão private */
	@SuppressWarnings("unused")
	private String registroGeral; /* a variável acima por padrão já é private e podem ser declarados explicitamente como aqui */
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	
	public Aluno() { /* Criar o objeto na memória - Construtor Padrão do Java */
				
	}
	
	public Aluno (String nomePadrao) {/* Outro construtor - sobrecarga de construtor */
		nome = nomePadrao;
	}
	
	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

}

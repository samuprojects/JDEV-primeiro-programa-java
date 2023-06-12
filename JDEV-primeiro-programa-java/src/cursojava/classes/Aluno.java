package cursojava.classes;

/* Esta classe (estrutura) representa um Aluno do mundo real que depois será um objeto na memória */
public class Aluno {

	/* Esses são os atributos do Aluno */
	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
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

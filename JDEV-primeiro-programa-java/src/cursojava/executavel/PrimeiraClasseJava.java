package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/* new Aluno() é uma instância (Criação de Objeto) */
		/* aluno1 é uma referência para o objeto Aluno() */
		Aluno aluno1 = new Aluno();
		
		Aluno aluno2 = new Aluno();
		
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);

	}
}
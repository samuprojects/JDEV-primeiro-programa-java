package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "João"; /* não é indicado deixar public, a solução será apresentada na aula seguinte */
		aluno1.idade = 50;
		
		System.out.println("Nome no aluno1 é: " + aluno1.nome);
		System.out.println(("Idade é = " + aluno1.idade));
		
		Aluno aluno2 = new Aluno();
		
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);

	}
}
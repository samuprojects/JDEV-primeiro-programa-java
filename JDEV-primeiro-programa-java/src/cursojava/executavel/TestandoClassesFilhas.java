package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alex JDev - Treinamento");
		aluno.setNomeEscola("Jdev - Treinamento");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("45654564654564");
		diretor.setNome("Egidio");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("0440455040");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
	}

}

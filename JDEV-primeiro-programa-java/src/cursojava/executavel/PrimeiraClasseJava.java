package cursojava.executavel;

import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF?");
		String mae = JOptionPane.showInputDialog("Nome da mãe?");
		String pai = JOptionPane.showInputDialog("Nome do pai?");
		String matricula = JOptionPane.showInputDialog("Data da matrícula?");
		String serie = JOptionPane.showInputDialog("Qual a série?");
		String escola = JOptionPane.showInputDialog("Nome da escola?");
		
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
		String note1 = JOptionPane.showInputDialog("Nota 1?");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
		String note2 = JOptionPane.showInputDialog("Nota 2?");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
		String note3 = JOptionPane.showInputDialog("Nota 3?");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
		String note4 = JOptionPane.showInputDialog("Nota 4?");

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		
		/* Excluído para receber as atualizações com uso de List */

		System.out.println(aluno1);
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
		
	}
}
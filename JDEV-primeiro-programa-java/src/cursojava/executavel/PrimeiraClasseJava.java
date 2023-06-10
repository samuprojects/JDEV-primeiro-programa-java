package cursojava.executavel;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 60;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*Operações lógicas aninhadas são operações dentro de operações*/

		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno está aprovado direto - Parabens " + media);
				} else {
					System.out.println("Aluno está aprovado direto " + media);
				}
			} else {
				System.out.println("Aluno está em recuperação: " + media);
			}
		} else {
			System.out.println("Aluno reprovado direto: " + media);
		}

	}
}

package cursojava.executavel;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		/* Estrutura de repetição FOR e Continue */

		System.out.println("Contando de 0 a 10...");
		for (int numero = 0; numero <= 10; numero++) {
			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("Obaaa, encontrei o número " + numero);
				continue;
			}

			System.out.println("Processando o laço de repetição...");
		}

		System.out.println("-----------------------------");

		System.out.println("Contando de 10 a 0...");
		for (int numero = 10; numero >= 0; numero--) {
			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("Obaaa, encontrei o número " + numero);
				continue;
			}

			System.out.println("Processando o laço de repetição");
		}
	}
}
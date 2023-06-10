package cursojava.executavel;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		/* Estrutura de repetição FOR com Break (Parada) */

		for (int numero = 0; numero <= 10; numero++) {
			System.out.println(numero);
			if (numero == 3) {
				System.out.println("Obaaa, encontrei o numero " + numero);
				System.out.println("Estou parando de executar...");
				break;
			}			
		}

		System.out.println("-----------------------------");

		for (int numero = 10; numero >= 0; numero--) {
			System.out.println(numero);
			if (numero == 3) {
				System.out.println("Obaaa, encontrei o numero " + numero);
				System.out.println("Estou parando de executar...");
				break;
			}	
		}
	}
}
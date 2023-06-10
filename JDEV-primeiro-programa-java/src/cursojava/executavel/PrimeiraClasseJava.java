package cursojava.executavel;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		/* Estrutura de repetição while (conceito de repetição enquanto for verdadeiro porém necessário a mudança para encerrar o código quando for falso */
		
		int numero = 0;
		
		while (numero <= 60) {/* 1º verificação, depois execução */
			
			System.out.println("O número atual é: " + numero);
			numero++;
		}
		
		System.out.println("----------------------------------");
		
		int numero2 = 0;
		do { /* 1º execução, depois verificação */
			System.out.println("O número atual é: " + numero2);
			numero2++;
		} while (numero2 <= 60);
	}
}

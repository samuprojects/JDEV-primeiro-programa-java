package cursojava.executavel;

public class PrimeiraClasseJava {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 60;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*SWITCH e CASE é melhor utilizado em operações exatas bem específicas*/
		
		int dia = 3;
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
			
		default: System.out.println("Outro dia qualquer");
			break;
		}
	}
}

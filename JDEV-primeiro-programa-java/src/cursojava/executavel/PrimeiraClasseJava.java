package cursojava.executavel;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
	
		double nota1 = 90;
		double nota2 = 70;
		double nota3 = 50;
		double nota4 = 88;
		
		double mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*Com o double passamos a considerar corretamente o resultado quebrado após a vírgula*/
		System.out.println("Média das notas = " + mediaFinal ); /* No exercício anterior o resultado era arredondado para menos*/

	
	}
}

package cursojava.executavel;

public class PrimeiraClasseJava {
	
	/* variável global acessível a todos e com valor compartilhado*/
	static int maiorIdadeGlobal = 30;
	
	public static void main(String[] args) {
	
	/*variável local pertence somente a este método assim como o seu valor*/	
	int maiorIdade = 18;
	
	System.out.println("Valor da variável local = " + maiorIdade);
	System.out.println("Valor da variável Global = " + maiorIdadeGlobal);
	metodo2();
		
	}
	
	@SuppressWarnings("unused")
	public static void metodo2() {
		int mediaAno = 50; /* variável local metodo2() */
		System.out.println("Valor da variável Global = " + maiorIdadeGlobal);
	}

}

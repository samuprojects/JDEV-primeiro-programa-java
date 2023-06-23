package cursojava.thread;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		for (int pos = 0 ; pos < 10; pos++) {
			
			// Para executar esse envio com tempo de parada ou com tempo determinado
			System.out.println("Executando alguma rotina, por exemplo envio de e-mail");
			
			Thread.sleep(1000); // Dá um tempo no código

		}
		
		System.out.println("Chegou ao fim do código de teste de thread");
		
	}

}

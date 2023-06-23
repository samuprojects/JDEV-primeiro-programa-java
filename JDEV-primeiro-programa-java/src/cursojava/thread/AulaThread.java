package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Thread processando em paralelo
		new Thread() {
			
			public void run() { // Executa o código da rotina que desejamos para a thread
				
				// código da rotina que será executado em paralelo
				for (int pos = 0 ; pos < 10; pos++) {
					
					System.out.println("Executando alguma rotina, por exemplo envio de e-mail");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				// Fim do código em paralelo
				
			}
			
		}.start(); // Liga a thread que fica processando paralelamente em background
		
		
		// Código do sistema do usuário continua o fluxo de trabalho
		System.out.println("Chegou ao fim do código de teste de thread");
		
		// Exemplo aqui seria o de um fluxo do sistema de cadastro de venda, ou emissão de nota fiscal, etc.
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
		
	}

}

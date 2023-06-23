package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Thread processando em paralelo do envio de email
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		
		// ******************* DIVISÃO DAS THREADS ************************
		
		// Thread processando em paralelo do envio de nota fiscal
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();
		
		
		// Código do sistema do usuário continua o fluxo de trabalho
		System.out.println("Chegou ao fim do código de teste de thread");
		
		// Exemplo aqui seria o de um fluxo do sistema de cadastro de venda, ou emissão de nota fiscal, etc.
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
		
	}
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			for (int pos = 0 ; pos < 10; pos++) {
				
				System.out.println("Executando alguma rotina, por exemplo envio de nota fiscal");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	};
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			for (int pos = 0 ; pos < 10; pos++) {
				
				System.out.println("Executando alguma rotina, por exemplo envio de e-mail");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	};

}

package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public void run() {
		Iterator iteracao = pilha_fila.iterator();
		
		synchronized (iteracao) { // Bloquear o acesso a essa lista por outros processos
			
			while (iteracao.hasNext()) { // Enquanto existir dados na lista irá processar
				
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); // Pega objeto atual
				
				// Processar dez mil notas fiscais
				// Gerar uma lista PDF
				// Gerar um envio de e-mail em massa
				System.out.println("-------------------------------");
				
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				iteracao.remove();
				
				try {
					Thread.sleep(100); // Dar um tempo para descarga de memória
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		try {
			Thread.sleep(1000); // Processou toda a lista dar um tempo para limpeza de memória
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

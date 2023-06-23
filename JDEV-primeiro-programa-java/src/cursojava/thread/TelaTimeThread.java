package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

@SuppressWarnings("serial")
public class TelaTimeThread extends JDialog {
	
	public TelaTimeThread() { // Executa o que estiver dentro no momento da instanciação do objeto
		
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		// Primeira parte concluída
		
		
		
		// Sempre será o último comando
		setVisible(true); // Torna a tela visível para o usuário
	}

}

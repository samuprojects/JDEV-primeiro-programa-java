package modulo.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivosTxt {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream entradaArquivo = new FileInputStream(new File("arquivo.txt"));
		
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while(lerArquivo.hasNext()) {
			
			String linha = lerArquivo.nextLine();
			
			if(linha != null && !linha.isEmpty()) {
				
				String[] dados = linha.split("\\|");
				
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(Integer.parseInt(dados[2]));
				
				pessoas.add(pessoa);
			}
		}
		
		
		for (Pessoa pessoa : pessoas) { // Poderia gravar no banco de dados, enviar email, gerar boleto, fazer outras coisas
			System.out.println(pessoa);
			
		};
	}
	

}

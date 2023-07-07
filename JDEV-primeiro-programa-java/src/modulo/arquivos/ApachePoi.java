package modulo.arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws IOException {
		
		File file = new File("arquivo_excel.xls");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEmail("pessoa1@gmail.com");
		pessoa1.setIdade(50);
		pessoa1.setNome("Alex egidio");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("pessoa2@gmail.com");
		pessoa2.setIdade(25);
		pessoa2.setNome("Samu test");
				
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("pessoa3@gmail.com");
		pessoa3.setIdade(40);
		pessoa3.setNome("Maria Jesus");
		
		Pessoa pessoa4 = new Pessoa();
		pessoa4.setEmail("pessoa4@gmail.com");
		pessoa4.setIdade(45);
		pessoa4.setNome("Paulo Pedro");
		
		
		// Pode vir do banco de dados ou qualquer outra fonte de dados
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);

		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); // Vai ser usado para escrever a planilha
		HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha de pessoas Jdev treinamento"); // Criar a planilha
		
		int numeroLinha = 0;
		for (Pessoa p : pessoas) {
			Row linha = linhasPessoa.createRow(numeroLinha ++); // Criado a linha na planilha
			
			int celula = 0;
			
			Cell celNome = linha.createCell(celula++); // Célula 1
			celNome.setCellValue(p.getNome());
			
			Cell celEmail = linha.createCell(celula++); // Célulka 2
			celEmail.setCellValue(p.getEmail());
			
			Cell celIdade = linha.createCell(celula++); // Célula 3
			celIdade.setCellValue(p.getIdade());
			
		} // Ao términoda montagem da planilha montar a saída
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida); // Escreve a planilha em um arquivo
		saida.flush();
		saida.close();
		hssfWorkbook.close(); // incluído por sugestão IDE avaliar se há alteração no comportamento da aplicação
		
		System.out.println("Planilha foi criada");
	}

}

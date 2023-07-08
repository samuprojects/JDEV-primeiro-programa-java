package modulo.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream entrada = new FileInputStream(new File("arquivo_excel.xls"));
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); // Prepara a entrada do arquivo excel para ler
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); // Pega a primeira planilha do nosso arquivo excel
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while (linhaIterator.hasNext()) { // Continuaa varrer enquanto houver linha no arquivo excel
			
			Row linha = linhaIterator.next(); // Dados da pessoa na linha
			
			Iterator<Cell> celulas = linha.iterator();
			
			Pessoa pessoa = new Pessoa();
			
			while(celulas.hasNext()) { // Percorrer as células
				
				Cell cell = celulas.next();
				
				switch(cell.getColumnIndex()) {
				case 0:
					pessoa.setNome((cell.getStringCellValue()));
					break;
				case 1:
					pessoa.setEmail(cell.getStringCellValue());
					break;
				case 2:
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;					
				}
				
			}// Fim das céluas da linha
			
			pessoas.add(pessoa);
		}
		
		entrada.close(); // Terminou de ler o arquivo excel
		
		for (Pessoa pessoa : pessoas) { // Poderia gravar no banco de dados, enviar email, etc.
			System.out.println(pessoa);
			
		}
		hssfWorkbook.close(); // fechado por sugestão da IDE pesquisar tema posteriormente
	}

}

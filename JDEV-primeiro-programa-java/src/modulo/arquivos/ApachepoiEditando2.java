package modulo.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class ApachepoiEditando2 {

	public static void main(String[] args) throws Exception {
		
		File file = new File("arquivo_excel.xls");
		
		FileInputStream entrada = new FileInputStream(file);
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); // Prepara a entrada do arquivo xls excel
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); // Pegando a planilha
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		while (linhaIterator.hasNext()) { // Enquanto houver linhas
			Row linha = linhaIterator.next(); // Dados da pessoa na linha
			
			String valorCelula = linha.getCell(0).getStringCellValue();
			
			linha.getCell(0).setCellValue(valorCelula + " * Valor gravado na aula ** ");
		}
		
		entrada.close();
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("Planilha atualizada");
		
		hssfWorkbook.close();

		// essa versão ainda não permite a manipulação do excel diretamente
		// um erro é gerado ao tentar rodar essa aplicação após uma alteração direta no excel
	}

}

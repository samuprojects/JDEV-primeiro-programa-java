package modulo.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2021");
		
		Date dataAtual = simpleDateFormat.parse("07/04/2021");
		
		// Se a data 1 é maior que a data 2
		if (dataVencimentoBoleto.after(dataAtual)) { // Posterior ou maior, ou depois da data atual
			System.out.println("Boleto não vencido");
			} else {
				System.out.println("Boleto vencido - URGENTE");
			}
		
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto2 = simpleDateFormat2.parse("01/04/2021");
		
		Date dataAtual2 = simpleDateFormat2.parse("11/04/2021");
		
		// Se a data 1 é menor que a data 2
		if (dataVencimentoBoleto2.before(dataAtual2)) {
			System.out.println("Boleto vencido - URGENTE");
			} else {
				System.out.println("Boleto não vencido");
			}

	}

}

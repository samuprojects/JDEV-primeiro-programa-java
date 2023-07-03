package modulo.datas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatasEmJava4 {

	public static void main(String[] args) {
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2019-01-01"), LocalDate.now()); // total de dias de uma data até hoje
		
		System.out.println("Possui " + dias + " dias entre a faixa de data solicitada");
	}

}

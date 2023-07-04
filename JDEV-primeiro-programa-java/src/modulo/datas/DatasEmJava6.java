package modulo.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatasEmJava6 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Nova API de data a partir do Java 8 
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data Atual: " + dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora atual: " + horaAtual);
		
		
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		
		//System.out.println("Data e hora atual: " + )
	}

}

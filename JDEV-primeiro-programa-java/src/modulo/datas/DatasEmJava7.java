package modulo.datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava7 {

	public static void main(String[] args) throws InterruptedException {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Data atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyy")));
		
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
		

		System.out.println("Dia do mês: " + localDate.getDayOfMonth());
		

		System.out.println("Dia do ano: " + localDate.getDayOfYear());
		

		System.out.println("Mes: " + localDate.getMonth());

		System.out.println("Ano: " + localDate.getYear());

		
//*****************************************************************************************		
		System.out.println("****************************************************************");
		
		Instant inicio = Instant.now();
		
		
		Thread.sleep(2000); // Pode ser um processo com tempo qualquer que não conhecemos
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Duração em nano segundos: " + duracao.toNanos());
		
		System.out.println("Duração em minutos: " + duracao.toMinutes());

		System.out.println("Duração em horas: " + duracao.toHours());

		System.out.println("Duração em milisegundos: " + duracao.toMillis());

		System.out.println("Duração em dias: " + duracao.toDays());

	}

}

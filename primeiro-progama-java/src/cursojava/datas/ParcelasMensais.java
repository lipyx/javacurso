package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class ParcelasMensais {

	public static void main(String[] args) throws ParseException {

		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("15/09/2022"); 
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);
		
		for (int parcela = 1; parcela <= 12; parcela++) {
			
			calendar.add(Calendar.MONTH, 1);
			
			System.out.println("Parcela número " + parcela + " vencimento é em :" + 
			new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}
		
		//API data java 8, LocalDate, LocalTime e LocalDateTime
			
		String dataAtual = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("data atual " + dataAtual);
		
		LocalTime hora = LocalTime.now();
		System.out.println("hora atual: " + hora);
	
		String diaHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm.ss"));
		System.out.println("Dia e hora atual: "+ diaHora);

	}
}

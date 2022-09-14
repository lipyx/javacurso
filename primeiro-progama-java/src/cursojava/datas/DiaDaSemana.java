package cursojava.datas;

import java.awt.Panel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class DiaDaSemana   {
	
	public static void main(String[] args)  {
	        
		    String date = JOptionPane.showInputDialog("Data de nascimento");
		    String dayWeek = "---";
		    GregorianCalendar gc = new GregorianCalendar();
		    try {
		        gc.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(date));
		        switch (gc.get(Calendar.DAY_OF_WEEK)) {
		            case Calendar.SUNDAY:
		                dayWeek = "DOMINGO";
		                break;
		            case Calendar.MONDAY:
		                dayWeek = "SEGUNDA";
		                break;
		            case Calendar.TUESDAY:
		                dayWeek = "TERCA";
		            break;
		            case Calendar.WEDNESDAY:
		                dayWeek = "QUARTA";
		                break;
		            case Calendar.THURSDAY:
		                dayWeek = "QUINTA";
		                break;
		            case Calendar.FRIDAY:
		                dayWeek = "SEXTA";
		                break;
		            case Calendar.SATURDAY:
		                dayWeek = "SABADO";

		        }
		    } catch (ParseException e) {
		        e.printStackTrace();
		    }
		    System.out.println(dayWeek);
		}
	}

	

	
	

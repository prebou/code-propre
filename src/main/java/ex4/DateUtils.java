package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe DateUtils permet de formater date et heure
 * */
public class DateUtils {

	/**/
	private static String PATTERN_DATE = "dd/MM/yyyy HH:mm:ss";

	public static String format(String pattern, Date date) {
		
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}
	
	public static String formatDefaut(Date date) {

		return format(PATTERN_DATE,date);
	}
}

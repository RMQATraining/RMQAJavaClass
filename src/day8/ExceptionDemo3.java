package day8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		try {
			parseDate();
		} catch (ParseException e) {
			System.out.println(e);
		}
	}

	public static void parseDate() throws ParseException {
		String date = "2001-01-11";
		System.out.println("before parsing: " + date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date parsedDate = sdf.parse(date);
		System.out.println("after parsing: " + parsedDate);

	}

}

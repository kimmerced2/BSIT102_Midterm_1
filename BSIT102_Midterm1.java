import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class BSIT102_Midterm1 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in();
		
		System.out.println("your date of birth? (Format day-month-year)");
		String input_birthday = sc.nextLine();

	
	Date date = new Date();
	SimpleDateFormat format = new SimpleDateFormat("day-month-year");
	Calendar calendar = new GregorianCalendar();
	
	Date birthday = format.parse(input_birthday);
	
	int year = calendar.get(Calendar.YEAR);
	calendar.setTime(birthday);
	
	int birthyear = calendar.get(Calendar.YEAR);
	
	int age = year - birthyear;
	System.out.print("My age: " + age);

    
	}
}

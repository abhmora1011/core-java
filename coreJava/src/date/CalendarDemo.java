package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance(); // get instance of the Calendar
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
		
		System.out.println(sdf2.format(cal.getTime()));
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println(cal.get(Calendar.AM_PM)); // AM = 0  PM = 1
	
		/*
		 * Difference of Calendar to Date
		 * Mas maraming option si Calendar kesa kay Date Class
		 */
		
	}
	

}

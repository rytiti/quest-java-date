import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Scanner; 

class TestDate {

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        
        Calendar c = new GregorianCalendar(year, month - 1, day);
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        Date d = c.getTime();
        int dayOfTheWeek = c.get(Calendar.DAY_OF_WEEK);

        
        System.out.println("The date is : " + sdf.format(d));
        System.out.println("The day of the week is : " + dayOfTheWeek);
        sc.close();
    }
}
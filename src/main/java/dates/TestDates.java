package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDates {
    public static void main(String[] args) {
        Date todayDate = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy à HH:mm:ss", Locale.getDefault());
        System.out.println(format1.format(todayDate));

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 19);
        cal.set(Calendar.MONTH, 5);
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 30);
        Date date1 = new Date(116,4,19,23,59, 30);

        System.out.println(format2.format(date1));
    }
}

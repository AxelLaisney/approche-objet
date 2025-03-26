package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calToday = Calendar.getInstance(Locale.FRANCE);
        Calendar cal1 = Calendar.getInstance(Locale.FRANCE);
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/YYYY à HH/mm/ss");
        SimpleDateFormat formatFr = new SimpleDateFormat("EEEE dd MMMM yyyy à HH:mm:ss", Locale.FRANCE);
        SimpleDateFormat format2Ch = new SimpleDateFormat("EEEE dd MMMM yyyy à HH:mm:ss", Locale.CHINA);
        SimpleDateFormat formatRu = new SimpleDateFormat("EEEE dd MMMM yyyy à HH:mm:ss", new Locale("ru"));

        cal1.set(Calendar.DAY_OF_MONTH, 19);
        cal1.set(Calendar.MONTH, 4);
        cal1.set(Calendar.YEAR, 2016);
        cal1.set(Calendar.HOUR_OF_DAY, 23);
        cal1.set(Calendar.MINUTE, 59);
        cal1.set(Calendar.SECOND, 30);

        Date date1 = cal1.getTime();
        Date today = calToday.getTime();
        System.out.println(today);
        System.out.println(format1.format(date1));

        Calendar calFr = Calendar.getInstance(Locale.FRANCE);
        Calendar calCh = Calendar.getInstance(Locale.CHINA);
        Calendar calRu = Calendar.getInstance(new Locale("ru"));

        Date datefr = calFr.getTime();
        Date datech = calCh.getTime();
        Date dateru = calRu.getTime();

        System.out.println(formatFr.format(datefr));
        System.out.println(format2Ch.format(datech));
        System.out.println(formatRu.format(dateru));
    }
}

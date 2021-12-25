package problem_solving.easy.warmup.time_conversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeConversion {

    public static String timeConversion(String s) {

        SimpleDateFormat displayTime = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat inputTime = new SimpleDateFormat("hh:mm:ssaa", Locale.ENGLISH);
        String result = "";

        try {
            Date date = inputTime.parse(s);
            System.out.println(date);
            result = displayTime.format(date);
            System.out.println(result);
        } catch (ParseException pe) {
            pe.printStackTrace();
        }

        return result;
    }
}

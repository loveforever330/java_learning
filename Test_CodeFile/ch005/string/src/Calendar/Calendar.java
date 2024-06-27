package Calendar;
import java.util.*;
public class Calendar {
    public static void main(String[] args) {
        java.util.Calendar calendar= java.util.Calendar.getInstance();
        int i=calendar.get(calendar.DAY_OF_WEEK);
        System.out.println(i);
        System.out.println(calendar.get(calendar.DAY_OF_MONTH));
        }

}

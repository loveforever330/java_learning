package date_test;

import java.util.Date;

public class Date_test {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d.toString());//当前日期

        Date d1=new Date(0L);
        System.out.println(d1);
    }
}

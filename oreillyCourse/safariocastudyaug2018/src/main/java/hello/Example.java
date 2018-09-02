package hello;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Created by SSarker on 8/29/2018.
 */
public class Example {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate date2 = date.plusDays(2l);
        System.out.println(date2);
        date2 = date2.plusDays(2l);
        System.out.println(date2);
        System.out.println(date2.plusDays(4l));
        Period p = Period.of(1,25,100);
        System.out.println(p);
        System.out.println(p.normalized());
        LocalDate fu  = date.plus(p);
        System.out.println(fu);
        System.out.println(DateTimeFormatter.ofPattern("d MM YYYY").format(date));
    }
}

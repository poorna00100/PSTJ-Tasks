/*
 * INPUT:
 * 2019-06-29
 * 2019-06-30
 *
 * OUTPUT:
 * Days Between Dates: 1
 *
 * Given two dates, calculate the absolute number of days between them.
 */
package Week3;
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
class Task2DaysBetweenDates{
    public int daysBetweenDates(String date1,String date2){
        LocalDate d1=LocalDate.parse(date1);
        LocalDate d2=LocalDate.parse(date2);
        return (int)Math.abs(ChronoUnit.DAYS.between(d1,d2));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first date: ");
        String date1=sc.next();
        System.out.print("Enter second date: ");
        String date2=sc.next();
        Task2DaysBetweenDates obj=new Task2DaysBetweenDates();
        int result=obj.daysBetweenDates(date1,date2);
        System.out.println("Days Between Dates: "+result);
        sc.close();
    }
}
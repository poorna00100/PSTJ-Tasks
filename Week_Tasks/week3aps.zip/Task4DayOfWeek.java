/*
 * INPUT:
 * 2026-09-17
 *
 * OUTPUT:
 * Day of Week: THURSDAY
 *
 * Given a date, return the day of the week.
 */
package Week3;
import java.util.*;
import java.time.*;
class Task4DayOfWeek{
    public String dayOfWeek(String date){
        LocalDate d=LocalDate.parse(date);
        return d.getDayOfWeek().toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter date: ");
        String date=sc.next();
        Task4DayOfWeek obj=new Task4DayOfWeek();
        String result=obj.dayOfWeek(date);
        System.out.println("Day of Week: "+result);
        sc.close();
    }
}
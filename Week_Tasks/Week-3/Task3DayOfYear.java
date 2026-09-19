/*
 * INPUT:
 * 2019-01-09
 *
 * OUTPUT:
 * Day of Year: 9
 *
 * Given a date, return the day number of the year.
 */
package Week3;
import java.util.*;
import java.time.*;
class Task3DayOfYear{
    public int dayOfYear(String date){
        LocalDate d=LocalDate.parse(date);
        return d.getDayOfYear();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter date: ");
        String date=sc.next();
        Task3DayOfYear obj=new Task3DayOfYear();
        int result=obj.dayOfYear(date);
        System.out.println("Day of Year: "+result);
        sc.close();
    }
}
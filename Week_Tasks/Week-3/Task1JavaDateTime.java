/*
 * INPUT:
 * 08 05 2015
 *
 * OUTPUT:
 * WEDNESDAY
 *
 * Given a date, find the day of the week.
 */
package Week3;
import java.util.*;
import java.time.*;
class Task1JavaDateTime{
    public static String findDay(int month,int day,int year){
        LocalDate date=LocalDate.of(year,month,day);
        return date.getDayOfWeek().toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month: ");
        int month=sc.nextInt();
        System.out.print("Enter day: ");
        int day=sc.nextInt();
        System.out.print("Enter year: ");
        int year=sc.nextInt();
        String result=findDay(month,day,year);
        System.out.println("Day: "+result);
        sc.close();
    }
}

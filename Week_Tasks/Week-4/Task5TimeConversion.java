/* 
Sample Input
07:05:45PM

Sample Output
19:05:45 */


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String period = time.substring(8);
        int hour = Integer.parseInt(time.substring(0, 2));
        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour += 12;
            }
        }
        String result = String.format(
            "%02d%s",
            hour,
            time.substring(2, 8)
        );
        System.out.println(result);
    }
}
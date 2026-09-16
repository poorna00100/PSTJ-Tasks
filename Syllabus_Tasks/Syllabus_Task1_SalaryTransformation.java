import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> salaries = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            salaries.add(sc.nextInt());
        }
        salaries.stream()
                .map(salary -> (int)(salary * 1.10))
                .forEach(salary -> System.out.print(salary + " "));
        sc.close();
    }
}

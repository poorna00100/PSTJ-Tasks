import java.util.*;

public class task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int currentSum = a[0];
        int maxSum = a[0];

        for (int i = 1; i < n; i++) {

            currentSum = Math.max(a[i], currentSum + a[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);

        sc.close();
    }
}

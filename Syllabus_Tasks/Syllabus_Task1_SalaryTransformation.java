// Salary Transformation System
// Problem Description
// A company stores employee salaries in a list. Increase each salary by 10% and print the updated salaries using functional transformation techniques.
// Input Format
// •	First line contains integer N.
// •	Second line contains N space-separated integers.
// Output Format
// Print updated salaries.
// Constraints
// •	1 ≤ N ≤ 10^5

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> salaries = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            salaries.add(sc.nextInt());
        }
        salaries.stream()
                .map(salary -> salary + (salary * 10 / 100))
                .forEach(salary -> System.out.print(salary + " "));
    }
}

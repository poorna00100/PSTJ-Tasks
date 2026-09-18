import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> marks =
            Arrays.asList(45, 78, 32, 90, 65, 88, 40, 95);

        // 1. Marks >= 50
        System.out.println("Marks >= 50:");
        marks.stream()
             .filter(mark -> mark >= 50)
             .forEach(System.out::println);

        // 2. Add 5 bonus marks
        System.out.println("After adding bonus:");
        marks.stream()
             .map(mark -> mark + 5)
             .forEach(System.out::println);

        // 3. Average
        double average = marks.stream()
                               .mapToInt(mark -> mark)
                               .average()
                               .getAsDouble();

        System.out.println("Average: " + average);

        // 4. Descending order
        System.out.println("Descending order:");
        marks.stream()
             .sorted(Comparator.reverseOrder())
             .forEach(System.out::println);
    }
}

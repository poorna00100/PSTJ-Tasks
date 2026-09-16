import java.util.*;
import java.util.stream.*;

public class task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> sensorIds = new ArrayList<>();
        List<Double> temperatures = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sensorIds.add(sc.next());
            temperatures.add(sc.nextDouble());
        }

        Map<String, Double> result = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (temperatures.get(i) > 50) {

                String id = sensorIds.get(i);
                double temp = temperatures.get(i);

                result.put(
                    id,
                    result.getOrDefault(id, 0.0) + temp
                );
            }
        }

        Map<String, Integer> count = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (temperatures.get(i) > 50) {
                String id = sensorIds.get(i);

                count.put(
                    id,
                    count.getOrDefault(id, 0) + 1
                );
            }
        }

        result.entrySet()
              .stream()
              .map(e -> new AbstractMap.SimpleEntry<>(
                      e.getKey(),
                      e.getValue() / count.get(e.getKey())
              ))
              .sorted((a, b) -> Double.compare(
                      b.getValue(),
                      a.getValue()
              ))
              .forEach(e ->
                      System.out.println(
                              e.getKey() + " " + e.getValue()
                      )
              );

        sc.close();
    }
}

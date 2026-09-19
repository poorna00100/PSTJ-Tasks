import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            set.add(num);
            if (deque.size() > m) {
                int removed = deque.removeFirst();
                if (!deque.contains(removed)) {
                    set.remove(removed);
                }
            }
            if (deque.size() == m) {
                max = Math.max(max, set.size());
            }
        }
        System.out.println(max);
        in.close();
    }
}
Sample Input

6 3
5 3 5 2 3 2
Sample Output

3

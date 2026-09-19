/* 
Sample Input
4 4 2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

Sample Output
3 4 8 12
2 11 10 16
1 7 6 15
5 9 13 14
*/
import java.util.*;

class Main {

    static void rotate(int[][] matrix, int r) {
        int m = matrix.length;
        int n = matrix[0].length;

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            ArrayList<Integer> values = new ArrayList<>();

            for (int i = layer; i < m - layer; i++) {
                values.add(matrix[i][layer]);
            }

            for (int j = layer + 1; j < n - layer; j++) {
                values.add(matrix[m - layer - 1][j]);
            }

            for (int i = m - layer - 2; i >= layer; i--) {
                values.add(matrix[i][n - layer - 1]);
            }

            for (int j = n - layer - 2; j > layer; j--) {
                values.add(matrix[layer][j]);
            }

            int len = values.size();
            int shift = r % len;

            int index = 0;

            for (int i = layer; i < m - layer; i++) {
                matrix[i][layer] =
                    values.get((index++ + shift) % len);
            }

            for (int j = layer + 1; j < n - layer; j++) {
                matrix[m - layer - 1][j] =
                    values.get((index++ + shift) % len);
            }

            for (int i = m - layer - 2; i >= layer; i--) {
                matrix[i][n - layer - 1] =
                    values.get((index++ + shift) % len);
            }

            for (int j = n - layer - 2; j > layer; j--) {
                matrix[layer][j] =
                    values.get((index++ + shift) % len);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        rotate(matrix, r);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);

                if (j < n - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
import java.util.*;

public class Main {

    static int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        return C;
    }

    static int[][] subtract(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        return C;
    }

    static int[][] strassen(int[][] A, int[][] B) {

        int n = A.length;

        if (n == 1) {
            return new int[][] {
                {A[0][0] * B[0][0]}
            };
        }

        int half = n / 2;

        int[][] A11 = new int[half][half];
        int[][] A12 = new int[half][half];
        int[][] A21 = new int[half][half];
        int[][] A22 = new int[half][half];

        int[][] B11 = new int[half][half];
        int[][] B12 = new int[half][half];
        int[][] B21 = new int[half][half];
        int[][] B22 = new int[half][half];

        for (int i = 0; i < half; i++) {
            for (int j = 0; j < half; j++) {

                A11[i][j] = A[i][j];
                A12[i][j] = A[i][j + half];
                A21[i][j] = A[i + half][j];
                A22[i][j] = A[i + half][j + half];

                B11[i][j] = B[i][j];
                B12[i][j] = B[i][j + half];
                B21[i][j] = B[i + half][j];
                B22[i][j] = B[i + half][j + half];
            }
        }

        int[][] M1 = strassen(
            add(A11, A22),
            add(B11, B22)
        );

        int[][] M2 = strassen(
            add(A21, A22),
            B11
        );

        int[][] M3 = strassen(
            A11,
            subtract(B12, B22)
        );

        int[][] M4 = strassen(
            A22,
            subtract(B21, B11)
        );

        int[][] M5 = strassen(
            add(A11, A12),
            B22
        );

        int[][] M6 = strassen(
            subtract(A21, A11),
            add(B11, B12)
        );

        int[][] M7 = strassen(
            subtract(A12, A22),
            add(B21, B22)
        );

        int[][] C11 = add(
            subtract(
                add(M1, M4),
                M5
            ),
            M7
        );

        int[][] C12 = add(M3, M5);

        int[][] C21 = add(M2, M4);

        int[][] C22 = add(
            subtract(
                add(M1, M3),
                M2
            ),
            M6
        );

        int[][] C = new int[n][n];

        for (int i = 0; i < half; i++) {
            for (int j = 0; j < half; j++) {

                C[i][j] = C11[i][j];
                C[i][j + half] = C12[i][j];
                C[i + half][j] = C21[i][j];
                C[i + half][j + half] = C22[i][j];
            }
        }

        return C;
    }

    static void printMatrix(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        int[][] result = strassen(A, B);

        printMatrix(result);

        sc.close();
    }
}

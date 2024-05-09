import java.util.*;

public class Main {



    public static void summ(int A[][], int B[][]) {

        int result[][] = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        print(result);
    }

    public static void subt(int A[][], int B[][]) {

        int result[][] = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        print(result);
    }

    public static void mult(int A[][], int B[][]) {

        int res[][] = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    res[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        print(res);
    }

    public static void Transpose(int A[][]) {


        int[][] res = new int[A[0].length][A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                res[j][i] = A[i][j];
            }
        }
        print(res);
    }

    public static void print(int a[][]) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        int tt = t;
        while (t-- > 0) {

            System.out.println();
            System.out.println("Case #"+(tt-t));

            int n1 = input.nextInt();
            int m1 = input.nextInt();
            int A[][] = new int[n1][m1];
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++) {
                    A[i][j] = input.nextInt();
                }
            }

            int n2 = input.nextInt();
            int m2 = input.nextInt();
            int B[][] = new int[n2][m2];
            for (int i = 0; i < n2; i++) {
                for (int j = 0; j < m2; j++) {
                    B[i][j] = input.nextInt();
                }
            }

            int q = input.nextInt();
            String query[] = new String[q];
            int k = 0;
            boolean f = true;
            q++;
            while (q-- > 0) {
                String s = input.nextLine();
                query[k] = s;
                k++;
                if (f) k--;
                f = false;
            }

            for (int i = 0; i < query.length; i++) {
                System.out.println(query[i]);
                switch (query[i]) {
                    case "SUM A B":
                        summ(A, B);
                        break;
                    case "SUBT A B":
                        subt(A, B);
                        break;
                    case "SUBT B A":
                        subt(B, A);
                        break;
                    case "MUL A B":
                        mult(A, B);
                        break;
                    case "MUL B A":
                        mult(B, A);
                        break;
                    case "Transpose A":
                        Transpose(A);
                        break;
                    case "Transpose B":
                        Transpose(B);
                        break;
                }
            }
        }
    }
}
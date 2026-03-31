import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    arr[i][j] = sc.nextInt();
            
            System.out.println("#" + t);
            for (int i = 0; i < N; i++) {
                // 90도
                for (int j = 0; j < N; j++) System.out.print(arr[N - 1 - j][i]);
                System.out.print(" ");
                // 180도
                for (int j = 0; j < N; j++) System.out.print(arr[N - 1 - i][N - 1 - j]);
                System.out.print(" ");
                // 270도
                for (int j = 0; j < N; j++) System.out.print(arr[j][N - 1 - i]);
                System.out.println();
            }
        }
        sc.close();
    }
}
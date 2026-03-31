import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    arr[i][j] = sc.nextInt();
                    
            int maxFlies = 0;
            for (int i = 0; i <= N - M; i++) {
                for (int j = 0; j <= N - M; j++) {
                    int currentFlies = 0;
                    for (int r = 0; r < M; r++) {
                        for (int c = 0; c < M; c++) {
                            currentFlies += arr[i + r][j + c];
                        }
                    }
                    maxFlies = Math.max(maxFlies, currentFlies);
                }
            }
            System.out.println("#" + t + " " + maxFlies);
        }
        sc.close();
    }
}
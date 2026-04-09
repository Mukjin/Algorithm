import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            // N x N 정사각형일 때 넓이가 최대
            System.out.println("#" + t + " " + (N * N));
        }
        sc.close();
    }
}
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int[] prices = new int[N];
            for (int i = 0; i < N; i++) prices[i] = sc.nextInt();
            
            long profit = 0; // 이익이 int 범위를 초과할 수 있으므로 long 필수
            int maxPrice = 0;
            
            for (int i = N - 1; i >= 0; i--) {
                if (prices[i] > maxPrice) {
                    maxPrice = prices[i];
                } else {
                    profit += maxPrice - prices[i];
                }
            }
            System.out.println("#" + t + " " + profit);
        }
        sc.close();
    }
}
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] moneyTypes = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int[] counts = new int[8];
            
            for (int i = 0; i < 8; i++) {
                counts[i] = N / moneyTypes[i];
                N %= moneyTypes[i];
            }
            
            System.out.println("#" + t);
            for (int count : counts) {
                System.out.print(count + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
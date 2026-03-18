import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] primes = {2, 3, 5, 7, 11};
        
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int[] counts = new int[5];
            
            for (int i = 0; i < 5; i++) {
                while (N % primes[i] == 0) {
                    counts[i]++;
                    N /= primes[i];
                }
            }
            
            System.out.print("#" + t + " ");
            for (int i = 0; i < 5; i++) {
                System.out.print(counts[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
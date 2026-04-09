import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int[] incomes = new int[N];
            int sum = 0;
            
            for (int i = 0; i < N; i++) {
                incomes[i] = sc.nextInt();
                sum += incomes[i];
            }
            
            double avg = (double) sum / N;
            int count = 0;
            
            for (int i = 0; i < N; i++) {
                if (incomes[i] <= avg) count++;
            }
            System.out.println("#" + t + " " + count);
        }
        sc.close();
    }
}
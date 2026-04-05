import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            // N이 클 수 있으므로 long 타입 사용
            long A = sc.nextLong();
            long B = sc.nextLong();
            long N = sc.nextLong();
            int count = 0;
            
            while (A <= N && B <= N) {
                if (A < B) A += B;
                else B += A;
                count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int L = sc.nextInt(); // 최소
            int U = sc.nextInt(); // 최대
            int X = sc.nextInt(); // 현재 운동량
            
            if (X > U) {
                System.out.println("#" + t + " -1");
            } else if (X < L) {
                System.out.println("#" + t + " " + (L - X)); // 부족한 양
            } else {
                System.out.println("#" + t + " 0"); // 적당함
            }
        }
        sc.close();
    }
}
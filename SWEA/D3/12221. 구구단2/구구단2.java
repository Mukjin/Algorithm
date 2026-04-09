import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            // 1~9 사이의 수인지 판별
            if (A >= 10 || B >= 10) {
                System.out.println("#" + t + " -1");
            } else {
                System.out.println("#" + t + " " + (A * B));
            }
        }
        sc.close();
    }
}
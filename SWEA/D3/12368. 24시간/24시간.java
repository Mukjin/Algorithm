import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            // 24로 나눈 나머지를 구하면 24시간제가 됨
            System.out.println("#" + t + " " + ((A + B) % 24));
        }
        sc.close();
    }
}
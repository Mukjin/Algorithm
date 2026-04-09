import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            // 3명씩 묶었을 때의 몫이 최대 조의 개수
            System.out.println("#" + t + " " + (N / 3));
        }
        sc.close();
    }
}
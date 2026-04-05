import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int max = -1, min = 10001, sum = 0;
            
            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                sum += num;
                if (num > max) max = num;
                if (num < min) min = num;
            }
            
            // 8.0으로 나누어 double 형으로 만든 뒤 Math.round 적용
            long avg = Math.round((sum - max - min) / 8.0);
            System.out.println("#" + t + " " + avg);
        }
    }
}
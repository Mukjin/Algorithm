import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int t = sc.nextInt();
            int[] counts = new int[101];
            
            for (int j = 0; j < 1000; j++) {
                counts[sc.nextInt()]++;
            }
            
            int mode = 0;
            int maxCount = 0;
            for (int j = 0; j <= 100; j++) {
                // 등호(>=)를 넣어야 빈도수가 같을 때 더 큰 점수로 갱신됨
                if (counts[j] >= maxCount) { 
                    maxCount = counts[j];
                    mode = j;
                }
            }
            System.out.println("#" + t + " " + mode);
        }
    }
}
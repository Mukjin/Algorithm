import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
        
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            Double[] scores = new Double[N];
            double targetScore = 0;
            
            for (int i = 0; i < N; i++) {
                int mid = sc.nextInt();
                int fin = sc.nextInt();
                int hw = sc.nextInt();
                scores[i] = mid * 0.35 + fin * 0.45 + hw * 0.20;
                if (i == K - 1) targetScore = scores[i];
            }
            
            // 내림차순 정렬
            Arrays.sort(scores, Collections.reverseOrder());
            
            int rank = 0;
            for (int i = 0; i < N; i++) {
                if (scores[i] == targetScore) {
                    rank = i;
                    break;
                }
            }
            System.out.println("#" + t + " " + grades[rank / (N / 10)]);
        }
    }
}
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[][] map = new int[N][N];

            // 입력
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            int result = 0;

            // 1. 가로 탐색
            for (int i = 0; i < N; i++) {
                int cnt = 0;
                for (int j = 0; j < N; j++) {
                    if (map[i][j] == 1) {
                        cnt++; // 연속된 1 증가
                    } else {
                        if (cnt == K) result++; // 정확히 K면 카운트
                        cnt = 0; // 초기화
                    }
                }
                // 줄 끝 체크
                if (cnt == K) result++;
            }

            // 2. 세로 탐색
            for (int j = 0; j < N; j++) {
                int cnt = 0;
                for (int i = 0; i < N; i++) {
                    if (map[i][j] == 1) {
                        cnt++;
                    } else {
                        if (cnt == K) result++;
                        cnt = 0;
                    }
                }
                if (cnt == K) result++;
            }

            System.out.println("#" + t + " " + result);
        }
    }
}
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] A = new int[N];
            int[] B = new int[M];

            // 배열 입력
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < M; i++) {
                B[i] = sc.nextInt();
            }

            int max = Integer.MIN_VALUE; // 최대값 저장

            // A가 더 긴 경우
            if (N > M) {
                for (int i = 0; i <= N - M; i++) { // 이동 횟수
                    int sum = 0;

                    for (int j = 0; j < M; j++) {
                        sum += A[i + j] * B[j]; // 곱해서 더하기
                    }

                    max = Math.max(max, sum);
                }
            }
            // B가 더 긴 경우
            else {
                for (int i = 0; i <= M - N; i++) {
                    int sum = 0;

                    for (int j = 0; j < N; j++) {
                        sum += A[j] * B[i + j];
                    }

                    max = Math.max(max, sum);
                }
            }

            System.out.println("#" + t + " " + max);
        }
    }
}
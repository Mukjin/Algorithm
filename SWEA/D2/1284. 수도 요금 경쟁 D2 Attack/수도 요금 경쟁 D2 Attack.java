import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 1; t <= T; t++) {
            int P = sc.nextInt(); // A사 리터당 요금
            int Q = sc.nextInt(); // B사 기본 요금
            int R = sc.nextInt(); // B사 기본 사용량
            int S = sc.nextInt(); // B사 초과 요금
            int W = sc.nextInt(); // 사용량

            // A회사 요금 계산
            int costA = P * W;

            int costB;
            // B회사 요금 계산
            if (W <= R) {
                costB = Q; // 기본요금만
            } else {
                costB = Q + (W - R) * S; // 초과분 추가
            }

            // 더 작은 값 선택
            int result = Math.min(costA, costB);

            // 출력 형식
            System.out.println("#" + t + " " + result);
        }
    }
}
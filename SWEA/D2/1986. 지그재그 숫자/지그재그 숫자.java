import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt(); // 숫자 N 입력

            int result = 0; // 누적 결과 저장 변수

            // 1부터 N까지 반복
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) {
                    result -= i; // 짝수면 빼기
                } else {
                    result += i; // 홀수면 더하기
                }
            }

            // 출력 형식
            System.out.println("#" + t + " " + result);
        }
    }
}
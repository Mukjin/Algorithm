import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 수

        // 각 달의 일 수 배열
        int[] days = {31, 28, 31, 30, 31, 30, 
                      31, 31, 30, 31, 30, 31};

        for (int t = 1; t <= T; t++) {

            // 입력
            int m1 = sc.nextInt();
            int d1 = sc.nextInt();
            int m2 = sc.nextInt();
            int d2 = sc.nextInt();

            int total1 = 0; // 첫 번째 날짜까지의 누적 일수
            int total2 = 0; // 두 번째 날짜까지의 누적 일수

            // 첫 번째 날짜 누적 계산
            for (int i = 0; i < m1 - 1; i++) {
                total1 += days[i]; // 이전 달까지 합
            }
            total1 += d1; // 현재 일 추가

            // 두 번째 날짜 누적 계산
            for (int i = 0; i < m2 - 1; i++) {
                total2 += days[i];
            }
            total2 += d2;

            // 결과 계산 (+1 포함!)
            int result = total2 - total1 + 1;

            System.out.println("#" + t + " " + result);
        }
    }
}
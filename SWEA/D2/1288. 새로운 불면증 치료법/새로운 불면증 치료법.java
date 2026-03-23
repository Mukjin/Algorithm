import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt(); // 입력

            boolean[] visited = new boolean[10]; // 0~9 체크 배열
            int count = 0; // 몇 개 숫자 봤는지
            int k = 1; // 배수

            while (true) {
                int num = N * k; // k번째 배수

                // 자리수 분해
                int temp = num;
                while (temp > 0) {
                    int digit = temp % 10; // 마지막 자리
                    if (!visited[digit]) {
                        visited[digit] = true;
                        count++; // 새로운 숫자 발견
                    }
                    temp /= 10;
                }

                // 0~9 모두 확인했으면 종료
                if (count == 10) {
                    System.out.println("#" + t + " " + num);
                    break;
                }

                k++; // 다음 배수
            }
        }
    }
}
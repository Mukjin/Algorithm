import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 1; t <= T; t++) {
            String s = sc.next(); // 문자열 입력

            // 문자열 뒤집기
            String reversed = new StringBuilder(s).reverse().toString();

            int result;
            // 원본과 비교
            if (s.equals(reversed)) {
                result = 1; // 회문
            } else {
                result = 0; // 아님
            }

            System.out.println("#" + t + " " + result);
        }
    }
}
import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스

        for (int t = 1; t <= T; t++) {
            String s = sc.next(); // 문자열 입력

            int answer = 0;

            // 패턴 길이 1~10까지 확인
            for (int i = 1; i <= 10; i++) {

                String pattern = s.substring(0, i);       // 앞부분
                String next = s.substring(i, i + i);      // 다음부분

                // 같으면 패턴 발견
                if (pattern.equals(next)) {
                    answer = i;
                    break;
                }
            }

            System.out.println("#" + t + " " + answer);
        }
    }
}
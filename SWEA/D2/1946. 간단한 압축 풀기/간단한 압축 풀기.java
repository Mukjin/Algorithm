import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            StringBuilder sb = new StringBuilder(); // 문자열을 이어 붙일 도구
            
            // 1. 압축 풀어서 하나의 긴 문자열로 만들기
            for (int i = 0; i < N; i++) {
                String charStr = sc.next();
                int count = sc.nextInt();
                
                // count 횟수만큼 글자를 이어 붙임
                for (int j = 0; j < count; j++) {
                    sb.append(charStr);
                }
            }
            
            System.out.println("#" + t);
            String result = sb.toString();
            
            // 2. 10글자씩 잘라서 출력하기
            for (int i = 0; i < result.length(); i += 10) {
                // 남은 글자가 10개보다 많으면 10개 단위로 자르기
                if (i + 10 < result.length()) {
                    System.out.println(result.substring(i, i + 10));
                } else {
                    // 남은 글자가 10개보다 적으면 끝까지 출력
                    System.out.println(result.substring(i));
                }
            }
        }
        sc.close();
    }
}
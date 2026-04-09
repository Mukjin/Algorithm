import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            String str = sc.next();
            // 정규표현식을 이용해 모음만 찾아 제거
            String result = str.replaceAll("[aeiou]", "");
            System.out.println("#" + t + " " + result);
        }
        sc.close();
    }
}
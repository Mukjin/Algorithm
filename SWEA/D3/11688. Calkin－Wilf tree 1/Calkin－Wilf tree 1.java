import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            String str = sc.next();
            int a = 1; // 분자
            int b = 1; // 분모
            
            for (char c : str.toCharArray()) {
                if (c == 'L') {
                    b = a + b;
                } else if (c == 'R') {
                    a = a + b;
                }
            }
            System.out.println("#" + t + " " + a + " " + b);
        }
        sc.close();
    }
}
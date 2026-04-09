import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            String original = sc.next();
            String dictation = sc.next();
            
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (original.charAt(i) == dictation.charAt(i)) {
                    count++;
                }
            }
            System.out.println("#" + t + " " + count);
        }
        sc.close();
    }
}
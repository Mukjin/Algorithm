import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            String s = String.valueOf(i);
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == '3' || c == '6' || c == '9') count++;
            }
            
            if (count > 0) {
                for (int j = 0; j < count; j++) System.out.print("-");
                System.out.print(" ");
            } else {
                System.out.print(s + " ");
            }
        }
        sc.close();
    }
}
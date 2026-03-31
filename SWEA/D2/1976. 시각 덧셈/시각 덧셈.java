import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();
            
            int totalM = m1 + m2;
            int addH = totalM / 60;
            int finalM = totalM % 60;
            
            int finalH = (h1 + h2 + addH) % 12;
            if (finalH == 0) {
                finalH = 12;
            }
            
            System.out.println("#" + t + " " + finalH + " " + finalM);
        }
        sc.close();
    }
}
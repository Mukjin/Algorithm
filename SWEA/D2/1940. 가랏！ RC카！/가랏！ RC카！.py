import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int currentSpeed = 0;
            int totalDistance = 0;
            
            for (int i = 0; i < N; i++) {
                int command = sc.nextInt();
                
                if (command == 1) { // 가속
                    currentSpeed += sc.nextInt();
                } else if (command == 2) { // 감속
                    currentSpeed -= sc.nextInt();
                    if (currentSpeed < 0) {
                        currentSpeed = 0;
                    }
                }
                // command == 0 인 경우는 속도 유지이므로 추가 연산 없음
                
                totalDistance += currentSpeed;
            }
            
            System.out.println("#" + t + " " + totalDistance);
        }
        sc.close();
    }
}
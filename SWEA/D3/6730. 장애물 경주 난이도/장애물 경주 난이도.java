import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            
            int maxUp = 0, maxDown = 0;
            for (int i = 0; i < N - 1; i++) {
                if (arr[i] < arr[i+1]) {
                    maxUp = Math.max(maxUp, arr[i+1] - arr[i]);
                } else if (arr[i] > arr[i+1]) {
                    maxDown = Math.max(maxDown, arr[i] - arr[i+1]);
                }
            }
            System.out.println("#" + t + " " + maxUp + " " + maxDown);
        }
        sc.close();
    }
}
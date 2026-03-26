import java.util.*;
 
class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 
        int T = sc.nextInt(); // 테스트 케이스 수
 
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt(); // 배열 크기
 
            int[] arr = new int[N];
 
            // 입력
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
 
            // 정렬 (오름차순)
            Arrays.sort(arr);
 
            // 출력
            System.out.print("#" + t);
            for (int num : arr) {
                System.out.print(" " + num);
            }
            System.out.println();
        }
    }
}
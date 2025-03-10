public class Solution {
    public int solution(int n) {
        int sum = 0; // 짝수의 합을 저장할 변수

        // 2부터 n까지 반복하며 짝수를 찾아 합산
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

        return sum;
    }
}
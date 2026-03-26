class Solution {
    public int solution(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10; // 마지막 자리
            n /= 10;
        }

        return sum;
    }
}
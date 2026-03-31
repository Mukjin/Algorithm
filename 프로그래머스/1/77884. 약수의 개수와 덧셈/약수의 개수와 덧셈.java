class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (i % Math.sqrt(i) == 0) answer -= i; // 약수가 홀수개
            else answer += i; // 약수가 짝수개
        }
        return answer;
    }
}
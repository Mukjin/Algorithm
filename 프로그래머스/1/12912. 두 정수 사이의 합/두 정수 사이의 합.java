class Solution {
    public long solution(int a, int b) {

        long answer = 0;

        int min = Math.min(a, b); // 작은 값
        int max = Math.max(a, b); // 큰 값

        // min부터 max까지 더하기
        for (int i = min; i <= max; i++) {
            answer += i;
        }

        return answer;
    }
}
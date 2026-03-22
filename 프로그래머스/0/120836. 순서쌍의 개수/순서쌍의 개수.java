class Solution {
    public int solution(int n) {
        int count = 0; // 순서쌍 개수 (약수 개수)

        // 1부터 n까지 반복
        for (int i = 1; i <= n; i++) {
            // i가 n의 약수인지 확인
            if (n % i == 0) {
                count++; // 약수면 카운트 증가
            }
        }

        return count; // 결과 반환
    }
}
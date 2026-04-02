import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0;
        // 뒤에서부터 m개씩 상자를 구성
        for (int i = score.length - m; i >= 0; i -= m) {
            answer += score[i] * m; // 현재 상자에서 가장 점수가 낮은 사과는 score[i]
        }
        return answer;
    }
}
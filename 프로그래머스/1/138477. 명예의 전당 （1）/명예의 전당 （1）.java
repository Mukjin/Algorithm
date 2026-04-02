import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);
            if (pq.size() > k) pq.poll(); // k개를 초과하면 가장 작은 값 제거
            answer[i] = pq.peek();        // 현재 명예의 전당 최하위 점수 기록
        }
        return answer;
    }
}
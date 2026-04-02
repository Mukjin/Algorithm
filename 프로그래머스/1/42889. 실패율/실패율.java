import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] users = new int[N + 2]; // 각 스테이지에 머물러 있는 유저 수
        for (int s : stages) users[s]++;
        
        List<double[]> list = new ArrayList<>();
        int total = stages.length; // 스테이지에 도달한 총 유저 수
        
        for (int i = 1; i <= N; i++) {
            if (total == 0) {
                list.add(new double[]{i, 0});
            } else {
                list.add(new double[]{i, (double) users[i] / total});
                total -= users[i];
            }
        }
        
        // 실패율(인덱스 1)을 기준으로 내림차순 정렬
        list.sort((a, b) -> Double.compare(b[1], a[1]));
        
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = (int) list.get(i)[0]; // 스테이지 번호(인덱스 0) 추출
        }
        return answer;
    }
}
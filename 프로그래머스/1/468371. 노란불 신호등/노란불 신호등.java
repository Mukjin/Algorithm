class Solution {
    public int solution(int[][] signals) {
        // 충분히 큰 시간까지 탐색
        int MAX_TIME = 10000000;
        
        // 시간이 1초부터 시작합니다.
        for (int t = 1; t <= MAX_TIME; t++) {
            boolean allYellow = true;
            
            for (int i = 0; i < signals.length; i++) {
                int green = signals[i][0];
                int yellow = signals[i][1];
                int red = signals[i][2];
                int cycle = green + yellow + red;
                
                // 💡 핵심 수정: t초일 때 실제 경과 시간은 (t - 1)입니다.
                int current = (t - 1) % cycle;
                
                // 노란불 구간: green <= current < green + yellow
                if (current < green || current >= green + yellow) {
                    allYellow = false;
                    break;
                }
            }
            
            // 모든 신호등이 노란불이면 현재 시간(t) 반환
            if (allYellow) {
                return t;
            }
        }
        
        return -1;
    }
}
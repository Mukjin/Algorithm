class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i = 0; i < schedules.length; i++) {
            int hour = schedules[i] / 100;
            int min = schedules[i] % 100 + 10;
            if (min >= 60) {
                hour++;
                min -= 60;
            }
            int limitTime = hour * 100 + min;
            
            boolean success = true;
            for (int j = 0; j < 7; j++) {
                // 현재 요일 (1=월 ~ 7=일)
                int currentDay = (startday - 1 + j) % 7 + 1;
                
                if (currentDay == 6 || currentDay == 7) continue; // 주말 제외
                
                if (timelogs[i][j] > limitTime) {
                    success = false;
                    break;
                }
            }
            if (success) answer++;
        }
        return answer;
    }
}
class Solution {
    public String solution(int a, int b) {
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int totalDays = b - 1; // 1월 1일이 시작이므로 -1
        for (int i = 0; i < a - 1; i++) {
            totalDays += months[i];
        }
        return days[totalDays % 7];
    }
}
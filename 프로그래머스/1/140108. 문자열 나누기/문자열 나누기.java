class Solution {
    public int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);
        int countX = 0, countY = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (countX == countY) {
                answer++;
                x = s.charAt(i); // 새로운 기준 문자
            }
            if (s.charAt(i) == x) countX++;
            else countY++;
        }
        return answer;
    }
}
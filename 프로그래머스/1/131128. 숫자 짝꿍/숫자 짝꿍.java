class Solution {
    public String solution(String X, String Y) {
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        for (char c : X.toCharArray()) countX[c - '0']++;
        for (char c : Y.toCharArray()) countY[c - '0']++;
        
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            int min = Math.min(countX[i], countY[i]);
            for (int j = 0; j < min; j++) sb.append(i);
        }
        
        String answer = sb.toString();
        if (answer.isEmpty()) return "-1";
        if (answer.charAt(0) == '0') return "0"; // 0으로만 구성된 경우
        
        return answer;
    }
}
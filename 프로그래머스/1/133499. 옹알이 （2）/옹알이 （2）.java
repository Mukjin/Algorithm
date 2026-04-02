class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String s : babbling) {
            // 연속 발음은 안 됨
            if (s.contains("ayaaya") || s.contains("yeye") || 
                s.contains("woowoo") || s.contains("mama")) continue;
            
            s = s.replace("aya", " ");
            s = s.replace("ye", " ");
            s = s.replace("woo", " ");
            s = s.replace("ma", " ");
            
            // 띄어쓰기를 모두 없앴을 때 길이가 0이면 발음 가능한 단어
            if (s.trim().length() == 0) answer++;
        }
        return answer;
    }
}
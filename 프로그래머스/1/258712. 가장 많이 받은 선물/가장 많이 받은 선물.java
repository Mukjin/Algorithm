import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        Map<String, Integer> idxMap = new HashMap<>();
        for (int i = 0; i < n; i++) idxMap.put(friends[i], i);
        
        int[][] history = new int[n][n]; // 준 사람, 받은 사람
        int[] score = new int[n]; // 선물 지수
        
        for (String g : gifts) {
            String[] s = g.split(" ");
            int giver = idxMap.get(s[0]);
            int taker = idxMap.get(s[1]);
            history[giver][taker]++;
            score[giver]++;
            score[taker]--;
        }
        
        int maxGifts = 0;
        for (int i = 0; i < n; i++) {
            int nextMonth = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (history[i][j] > history[j][i] || 
                   (history[i][j] == history[j][i] && score[i] > score[j])) {
                    nextMonth++;
                }
            }
            maxGifts = Math.max(maxGifts, nextMonth);
        }
        return maxGifts;
    }
}
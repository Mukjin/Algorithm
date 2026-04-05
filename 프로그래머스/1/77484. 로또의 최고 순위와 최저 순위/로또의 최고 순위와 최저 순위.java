class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int matchCount = 0;
        
        for (int l : lottos) {
            if (l == 0) zeroCount++;
            else {
                for (int w : win_nums) {
                    if (l == w) {
                        matchCount++;
                        break;
                    }
                }
            }
        }
        
        int maxRank = Math.min(7 - (matchCount + zeroCount), 6);
        int minRank = Math.min(7 - matchCount, 6);
        
        return new int[]{maxRank, minRank};
    }
}
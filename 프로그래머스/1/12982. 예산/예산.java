import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int count = 0;
        for (int cost : d) {
            if (budget < cost) break;
            budget -= cost;
            count++;
        }
        return count;
    }
}
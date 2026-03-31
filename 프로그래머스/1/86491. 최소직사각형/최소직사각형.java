class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0, maxH = 0;
        for (int[] size : sizes) {
            maxW = Math.max(maxW, Math.max(size[0], size[1]));
            maxH = Math.max(maxH, Math.min(size[0], size[1]));
        }
        return maxW * maxH;
    }
}
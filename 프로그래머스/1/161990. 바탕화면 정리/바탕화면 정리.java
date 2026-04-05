class Solution {
    public int[] solution(String[] wallpaper) {
        int minR = Integer.MAX_VALUE, minC = Integer.MAX_VALUE;
        int maxR = Integer.MIN_VALUE, maxC = Integer.MIN_VALUE;
        
        for (int r = 0; r < wallpaper.length; r++) {
            for (int c = 0; c < wallpaper[r].length(); c++) {
                if (wallpaper[r].charAt(c) == '#') {
                    minR = Math.min(minR, r);
                    minC = Math.min(minC, c);
                    maxR = Math.max(maxR, r);
                    maxC = Math.max(maxC, c);
                }
            }
        }
        // 우측 하단 끝점을 포함하기 위해 최대좌표에 +1
        return new int[]{minR, minC, maxR + 1, maxC + 1}; 
    }
}
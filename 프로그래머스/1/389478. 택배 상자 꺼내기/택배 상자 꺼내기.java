class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int targetRow = (num - 1) / w;
        int targetCol = getCol(num, w);
        
        for (int i = num; i <= n; i++) {
            if (getCol(i, w) == targetCol) answer++;
        }
        
        return answer;
    }
    
    private int getCol(int num, int w) {
        int row = (num - 1) / w;
        int col = (num - 1) % w;
        return (row % 2 == 0) ? col : (w - 1 - col); // 지그재그 처리
    }
}
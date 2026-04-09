import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats); // 큰 돗자리부터 확인하기 위해 정렬
        
        for (int i = mats.length - 1; i >= 0; i--) {
            int size = mats[i];
            if (canPlace(size, park)) return size;
        }
        
        return -1;
    }
    
    private boolean canPlace(int size, String[][] park) {
        int rows = park.length;
        int cols = park[0].length;
        
        for (int i = 0; i <= rows - size; i++) {
            for (int j = 0; j <= cols - size; j++) {
                if (isAllEmpty(i, j, size, park)) return true;
            }
        }
        return false;
    }
    
    private boolean isAllEmpty(int r, int c, int size, String[][] park) {
        for (int i = r; i < r + size; i++) {
            for (int j = c; j < c + size; j++) {
                if (!park[i][j].equals("-1")) return false;
            }
        }
        return true;
    }
}
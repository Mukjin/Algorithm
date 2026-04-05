class Solution {
    public int[] solution(String[] park, String[] routes) {
        int r = 0, c = 0;
        int H = park.length, W = park[0].length();
        
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (park[i].charAt(j) == 'S') {
                    r = i;
                    c = j;
                    break;
                }
            }
        }
        
        for (String route : routes) {
            char op = route.charAt(0);
            int n = route.charAt(2) - '0';
            
            int tempR = r, tempC = c;
            boolean possible = true;
            
            for (int i = 0; i < n; i++) {
                if (op == 'N') tempR--;
                else if (op == 'S') tempR++;
                else if (op == 'W') tempC--;
                else if (op == 'E') tempC++;
                
                // 공원을 벗어나거나 장애물을 만나면 이동 전체를 무효화
                if (tempR < 0 || tempR >= H || tempC < 0 || tempC >= W || park[tempR].charAt(tempC) == 'X') {
                    possible = false;
                    break;
                }
            }
            
            if (possible) {
                r = tempR;
                c = tempC;
            }
        }
        return new int[]{r, c};
    }
}
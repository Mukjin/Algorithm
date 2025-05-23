class Solution {
    public int solution(int n) {
        
        if((double)Math.sqrt(n) % 1 == 0) {
            return 1;
        }
        return 2;
    }
}

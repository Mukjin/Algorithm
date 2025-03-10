class Solution {
    public int solution(int n, int t) {
        int answer = n;
        for(int i = 1; i <= t; i++){
            n *= 2;
        }
        return n;
    }
}
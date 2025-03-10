class Solution {
    public int solution(int n) {
        int answer = 0;
        int max;
        int pizza = 6;
        
        if (pizza <= n) {
            max = n;
        } else {
            max = pizza;
        }
        
        for (int i = max; max <= i; i++) {
            if (i % n == 0 && i % pizza == 0) {
                answer = i / pizza;
                break;
            }
        }
        return answer;
    }
}
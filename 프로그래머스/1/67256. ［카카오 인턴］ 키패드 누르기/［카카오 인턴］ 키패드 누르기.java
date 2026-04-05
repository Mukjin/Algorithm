class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int left = 10;
        int right = 12; 
        
        for (int n : numbers) {
            if (n == 0) n = 11;
            
            if (n % 3 == 1) { // 1, 4, 7
                sb.append("L");
                left = n;
            } else if (n % 3 == 0) { // 3, 6, 9
                sb.append("R");
                right = n;
            } else { // 2, 5, 8, 0
                int leftDist = Math.abs(n - left) / 3 + Math.abs(n - left) % 3;
                int rightDist = Math.abs(n - right) / 3 + Math.abs(n - right) % 3;
                
                if (leftDist < rightDist || (leftDist == rightDist && hand.equals("left"))) {
                    sb.append("L");
                    left = n;
                } else {
                    sb.append("R");
                    right = n;
                }
            }
        }
        return sb.toString();
    }
}
class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        
        int min = arr[0];
        for (int a : arr) min = Math.min(min, a);
        
        int[] answer = new int[arr.length - 1];
        int idx = 0;
        for (int a : arr) {
            if (a != min) answer[idx++] = a;
        }
        return answer;
    }
}
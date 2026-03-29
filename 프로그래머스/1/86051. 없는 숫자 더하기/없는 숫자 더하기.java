class Solution {
    public int solution(int[] numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        return 45 - sum;
    }
}
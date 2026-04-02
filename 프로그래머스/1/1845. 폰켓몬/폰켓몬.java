import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        // 전체 종류 수와 고를 수 있는 최대 수(N/2) 중 작은 값을 반환
        return Math.min(set.size(), nums.length / 2);
    }
}
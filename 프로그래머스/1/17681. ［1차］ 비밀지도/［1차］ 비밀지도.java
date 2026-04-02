class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            // 두 숫자를 비트 OR 연산 후 이진수 문자열로 변환
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
            // 앞부분이 0으로 채워지지 않는 문제를 해결하기 위한 포맷팅
            binary = String.format("%" + n + "s", binary);
            answer[i] = binary.replaceAll("1", "#").replaceAll("0", " ");
        }
        return answer;
    }
}
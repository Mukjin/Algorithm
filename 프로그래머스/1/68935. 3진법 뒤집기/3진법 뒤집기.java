class Solution {
    public int solution(int n) {
        // 1. 3진법 변환 후 바로 뒤집기
        String reversedStr = new StringBuilder(Integer.toString(n, 3)).reverse().toString();
        // 2. 뒤집힌 문자열을 다시 10진수로 변환
        return Integer.parseInt(reversedStr, 3);
    }
}
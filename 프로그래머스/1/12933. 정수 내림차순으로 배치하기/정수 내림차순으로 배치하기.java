import java.util.*;

class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();

        Arrays.sort(arr); // 오름차순
        StringBuilder sb = new StringBuilder(new String(arr));

        return Long.parseLong(sb.reverse().toString()); // 뒤집어서 내림차순
    }
}
class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();

        int p = 0, y = 0;

        for (char c : s.toCharArray()) {
            if (c == 'p') p++;
            if (c == 'y') y++;
        }

        return p == y;
    }
}
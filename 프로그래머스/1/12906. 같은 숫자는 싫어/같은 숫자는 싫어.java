import java.util.*;

public class Solution {
    public int[] solution(int [] arr) {
        List<Integer> list = new ArrayList<>();
        int last = -1;
        for (int a : arr) {
            if (last != a) list.add(a);
            last = a;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
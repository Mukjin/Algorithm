import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        HashMap<String, Integer> termMap = new HashMap<>();
        
        int todayDays = getDays(today); // 오늘 날짜 일수 환산
        
        for (String t : terms) {
            String[] split = t.split(" ");
            termMap.put(split[0], Integer.parseInt(split[1]) * 28);
        }
        
        for (int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(" ");
            int limitDays = getDays(split[0]) + termMap.get(split[1]);
            
            if (limitDays <= todayDays) list.add(i + 1); // 만료 여부 검사
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
    
    private int getDays(String date) {
        String[] split = date.split("\\.");
        return (Integer.parseInt(split[0]) * 12 * 28) + 
               (Integer.parseInt(split[1]) * 28) + 
               Integer.parseInt(split[2]);
    }
}
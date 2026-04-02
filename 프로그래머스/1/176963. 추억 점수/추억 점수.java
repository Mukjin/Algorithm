import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            for (String person : photo[i]) {
                answer[i] += map.getOrDefault(person, 0); // 없으면 0점 추가
            }
        }
        return answer;
    }
}
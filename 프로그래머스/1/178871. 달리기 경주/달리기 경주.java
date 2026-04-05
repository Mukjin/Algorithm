import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String calling : callings) {
            int rank = map.get(calling);
            String frontPlayer = players[rank - 1];
            
            // 배열 스왑
            players[rank - 1] = calling;
            players[rank] = frontPlayer;
            
            // Map 등수 갱신
            map.put(calling, rank - 1);
            map.put(frontPlayer, rank);
        }
        return players;
    }
}
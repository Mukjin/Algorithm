class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video = toSec(video_len);
        int current = toSec(pos);
        int start = toSec(op_start);
        int end = toSec(op_end);
        
        for (String cmd : commands) {
            // 오프닝 구간이면 점프 (명령 수행 전후 모두 체크 필요)
            if (current >= start && current <= end) current = end;
            
            if (cmd.equals("prev")) current = Math.max(0, current - 10);
            else current = Math.min(video, current + 10);
            
            if (current >= start && current <= end) current = end;
        }
        
        return String.format("%02d:%02d", current / 60, current % 60);
    }
    
    private int toSec(String time) {
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
    }
}
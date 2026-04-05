class Solution {
    public String solution(String new_id) {
        String id = new_id.toLowerCase(); // 1단계
        id = id.replaceAll("[^-_.a-z0-9]", ""); // 2단계
        id = id.replaceAll("\\.{2,}", "."); // 3단계
        id = id.replaceAll("^\\.|\\.$", ""); // 4단계
        
        if (id.isEmpty()) id = "a"; // 5단계
        
        if (id.length() >= 16) { // 6단계
            id = id.substring(0, 15).replaceAll("\\.$", "");
        }
        
        while (id.length() <= 2) { // 7단계
            id += id.charAt(id.length() - 1);
        }
        return id;
    }
}
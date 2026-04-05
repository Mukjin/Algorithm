class Solution {
    public int solution(int[] ingredient) {
        int[] stack = new int[ingredient.length];
        int sp = 0; // Stack Pointer
        int answer = 0;
        
        for (int i : ingredient) {
            stack[sp++] = i;
            
            if (sp >= 4 && 
                stack[sp - 4] == 1 &&
                stack[sp - 3] == 2 &&
                stack[sp - 2] == 3 &&
                stack[sp - 1] == 1) {
                
                sp -= 4; // 햄버거 완성, 요소 4개 제거
                answer++;
            }
        }
        return answer;
    }
}
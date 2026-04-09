class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;
        int lastAttackTime = 0;
        
        for (int[] attack : attacks) {
            int time = attack[0];
            int damage = attack[1];
            
            // 1. 공격 직전까지 회복
            int diff = time - lastAttackTime - 1;
            if (diff > 0) {
                health += diff * bandage[1]; // 초당 회복
                health += (diff / bandage[0]) * bandage[2]; // 추가 회복
                if (health > maxHealth) health = maxHealth;
            }
            
            // 2. 공격 받음
            health -= damage;
            if (health <= 0) return -1;
            
            lastAttackTime = time;
        }
        
        return health;
    }
}
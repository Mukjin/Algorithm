class Solution {
    public int solution(int n, int k) {
        // 양꼬치 가격 계산 (1인분 = 12,000원)
        int lambPrice = 12000 * n;
        
        // 무료로 제공되는 음료수 개수 계산 (10인분당 1개)
        int freeDrinks = n / 10;
        
        // 음료수 가격 계산 (음료수 1개 = 2,000원)
        int drinkPrice = 2000 * (k - freeDrinks);
        
        // 총 가격 계산
        int totalPrice = lambPrice + drinkPrice;
        
        return totalPrice;
    }
}
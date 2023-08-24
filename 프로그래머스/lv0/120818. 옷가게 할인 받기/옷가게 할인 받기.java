class Solution {
    public int solution(int price) {
        int answer = price; // 초기에는 할인을 적용하지 않은 가격

        if (price >= 500000) {
            answer -= price * 0.2; // 50만 원 이상일 때 20% 할인
        } else if (price >= 300000) {
            answer -= price * 0.1; // 30만 원 이상일 때 10% 할인
        } else if (price >= 100000) {
            answer -= price * 0.05; // 10만 원 이상일 때 5% 할인
        }
        return answer;
    }
}
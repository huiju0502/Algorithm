class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 7 == 0) { // 7명으로 나누어 떨어지면 
            answer = n / 7;
        }else { // 7명으로 나누어 떨어지면
            answer = (n / 7) + 1;
        }
        return answer;
    }
}
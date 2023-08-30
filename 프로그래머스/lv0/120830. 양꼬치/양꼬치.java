class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        if(n / 10 >= 1){
            k -= (n / 10); // 마신 음료수 - 서비스로 받은 음료수 
        }
        
        answer = 12000 * n + 2000 * k;
        return answer;
    }
}
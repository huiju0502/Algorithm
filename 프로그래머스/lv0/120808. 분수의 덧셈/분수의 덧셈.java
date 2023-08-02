class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 배열 2열로 초기화
        int[] answer = new int[2];
        
        answer[0] = denom1 * numer2 + denom2 * numer1;  // 분자 = 10
        answer[1] = denom1 * denom2;  // 분모 = 8
        
        int min = Math.min(answer[0], answer[1]); // min = 8
        int max = 0;
        for(int i=1; i<=min; i++){
            if(answer[0]%i == 0 && answer[1]%i == 0)
                max = i;
        }
        answer[0] /= max;
        answer[1] /= max;
        return answer;
    }
}
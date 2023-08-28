class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i); // 현재 위치의 문자 가져오기
            for(int j=0; j<n; j++){ // 해당 문자를 n번 반복하여 추가
                answer += c;
            }
        }
        return answer;
    }
}
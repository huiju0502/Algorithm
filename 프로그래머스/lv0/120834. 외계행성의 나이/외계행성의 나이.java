class Solution {
    public String solution(int age) {
        String answer = "";
        String alphabet = "abcdefghij"; // 알파벳 문자열

        while (age > 0) {
            int remainder = age % 10; // 나이를 10으로 나눈 나머지 계산
            char c = alphabet.charAt(remainder); // 알파벳으로 변환
            answer = c + answer; // 문자를 결과 문자열의 가장 앞에 추가
            age /= 10; // 다음 자리로 이동
        }
        return answer;
    }
}
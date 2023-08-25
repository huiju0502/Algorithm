class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length];
        
        for (int i = 0; i < length; i++) {
            answer[length - 1 - i] = num_list[i];
        }
        
        return answer;
    }
}
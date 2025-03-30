class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        for (int i = 0; i < index_list.length; i++) {
            String letter = my_string.substring(index_list[i], index_list[i] + 1);
            answer = answer.concat(letter);
        }
        
        return answer;
    }
}
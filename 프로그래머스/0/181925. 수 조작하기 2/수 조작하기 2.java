class Solution {
    public String solution(int[] numLog) {
        String letter;
        String answer = "";
        
        for(int i = 0; i < numLog.length - 1; i++) {
            switch(numLog[i + 1] - numLog[i]) {
                case 1:
                    letter = "w";
                    break;
                case -1:
                    letter = "s";
                    break;
                case 10:
                    letter = "d";
                    break;
                    
                default:
                    letter = "a";
                    break;
            }
            answer = answer.concat(letter);
        }
        
        return answer;
    }
}
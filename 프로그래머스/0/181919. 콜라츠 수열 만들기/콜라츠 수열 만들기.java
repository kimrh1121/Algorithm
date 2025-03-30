class Solution {
    public int[] solution(int n) {
        int count = 0;
        int[] numbers = new int[1000];
        
        do {
            numbers[count] = n;
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
            count++;
        }while (n != 1);
        numbers[count] = 1;
        
        int[] answer = new int[count + 1];
        for(int i = 0; i < count + 1; i++)
            answer[i] = numbers[i];
        
        return answer;
    }
}
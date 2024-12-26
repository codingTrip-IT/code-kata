class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        double avg = 0;
        
        if(numbers.length>=1 && numbers.length<=100){
            for(int num:numbers) {
                if(num>=0 && num<=1000){
                    sum += num;
                }
            }
            
            answer = sum/numbers.length;

        }
        return answer;
    }
}
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        
        if(arr.length>=1 && arr.length<=100){
            for(int i : arr){
                if(i>=-10000 && i<=10000){
                    sum += i;
                }
            }
            answer = sum / arr.length;
        }
        return answer;
    }
}
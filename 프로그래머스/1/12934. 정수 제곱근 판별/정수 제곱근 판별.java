class Solution {
    public long solution(long n) {
        long answer = 0;
        long x = (long)Math.sqrt(n);
        answer = (n==Math.pow(x,2))?(long)Math.pow((x+1),2):-1;
        return answer;
    }
}
class Solution {
    public long solution(long n) {
        long answer = 0;
        long i = 1;
        while (i <= n) {
            if (Math.pow(i, 2) == n) {
                answer = (i + 1) * (i + 1);
                break;
            }
            i++;
        }
        if (answer == 0) {
            answer = -1;
        }
        return answer;
    }
}
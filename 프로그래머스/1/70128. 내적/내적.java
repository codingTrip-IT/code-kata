class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int i = 0;
        while(i<a.length){
            answer += a[i]*b[i];
            i++;
        }
        return answer;
    }
}
class Solution {
    public String solution(int n) {
        String answer = "";
        int i = 0;

        while (i < n) {
            if (i % 2 == 0) {
                answer += "수";
                i++;
            } else {
                answer += "박";
                i++;
            }

        }
        return answer;
    }
}
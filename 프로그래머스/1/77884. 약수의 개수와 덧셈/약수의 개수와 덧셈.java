class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
         int i = left;
            
            while (i <= right) {
                int count = 0;
                int j = 1;
                while (j <= i) {
                    if (i % j == 0) {
                        count++;
                        j++;
                    } else {
                        j++;
                    }
                }
                if (count % 2 == 0) {
                    answer += i;
                } else {
                    answer -= i;
                }
                i++;
            }
        return answer;
    }
}
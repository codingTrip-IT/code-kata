class Solution {
        public long solution(int a, int b) {
            long answer = 0;
            if (a == b) {
                answer = a;
            }
            while (true) {
                if (a > b) {
                    answer += b;
                    b++;
                    if (a == b) {
                        answer += a;
                        break;
                    }
                } else if (b > a) {
                        answer += a;
                        a++;
                        if (b == a) {
                            answer += b;
                            break;
                        }
                }
            }
            return answer;
        }
    }
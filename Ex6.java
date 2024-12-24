public class Ex6 {
    class Solution {
        public int solution(int num1, int num2) {
            int answer = -1;
            boolean check = num1>=-50000 && num1<=50000 && num2>=-50000 && num2<=50000;
            if(check){
                answer = num1 + num2;
            }
            return answer;
        }
    }
}

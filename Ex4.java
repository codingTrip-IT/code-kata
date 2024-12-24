public class Ex4 {
    class Solution {
        public int solution(int age) {
            int answer = 0;
            int year = 2022;
            if(age>=0 && age <=120){
                answer = year-age+1;
            }
            return answer;
        }
    }
}

public class Ex8 {
    class Solution {
        public int solution(int angle) {
            int answer = 0;
            String gak = "";

            if(angle>0 && angle<=180){
                if(angle>0 & angle<90){
                    gak = "예각";
                } else if(angle==90){
                    gak = "직각";
                } else if(angle>90 && angle <180){
                    gak = "둔각";
                } else {
                    gak = "평각";
                }
            }

            switch(gak){
                case "예각" :
                    answer = 1;
                    break;
                case "직각" :
                    answer = 2;
                    break;
                case "둔각" :
                    answer = 3;
                    break;
                case "평각" :
                    answer = 4;
                    break;
            }
            return answer;
        }
    }
}

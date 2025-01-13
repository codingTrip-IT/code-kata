import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        String kim = "Kim";
        int index = Arrays.asList(seoul).indexOf(kim);
        for(String s : seoul){
            if("Kim".equals(s)){
                answer = "김서방은 "+index+"에 있다";
            }
        }
        return answer;
    }
}
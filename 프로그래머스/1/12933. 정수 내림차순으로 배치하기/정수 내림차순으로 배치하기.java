import java.util.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String strN = "" + n;
        Long[] longArr = new Long[strN.length()];
        for (int i = 0; i < strN.length(); i++) {
            longArr[i] = parseLong(String.valueOf(strN.charAt(i)));
        }
        Arrays.sort(longArr, Collections.reverseOrder());
        strN = "";
        for(Long a : longArr){
            strN+=a;
        }
        answer = parseLong(strN);
        return answer;
    }
}
import java.util.*;
import static java.lang.Integer.parseInt;
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String strX = ""+x;
        int[] arrX = new int[strX.length()];
        int sum=0;
        for(int i=0;i<strX.length();i++){
            arrX[i]=Integer.parseInt(String.valueOf(strX.charAt(i)));;
        }
        for(int i=0;i<arrX.length;i++){
            sum += arrX[i];
        }
        answer = (x%sum)==0?true:false;
        
        return answer;
    }
}
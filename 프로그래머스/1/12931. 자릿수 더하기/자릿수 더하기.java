import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 0;
        int b = n;
        
        for(int i=(int)(Math.log10(n)+1);i>=0;i--){
            answer += b / Math.pow(10,i);
            b = b % (int)Math.pow(10,i);
        }
        
        
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}
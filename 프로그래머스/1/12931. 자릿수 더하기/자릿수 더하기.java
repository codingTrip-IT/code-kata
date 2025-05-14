import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String str = n + "";

        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(str.substring(i,i+1));
        }

        return answer;
    }
}
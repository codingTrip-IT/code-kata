import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
            int start = 0;
            int end = p.length();
            long pNumber = Long.parseLong(p);
            List<Long> values = new ArrayList<>();

            while (end<=t.length()){
                values.add(Long.parseLong(t.substring(start, end)));
                start++;
                end++;
            }

            System.out.println("values = " + values);

            for (Long v : values) {
                if (v <= pNumber){
                    answer++;
                }
            }
        return answer;
    }
}
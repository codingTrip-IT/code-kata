import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        ArrayList<Long> list = new ArrayList<>();

        for (int j = 1; j <= n; j++) {
            list.add(x*(long)j);
        }
        answer = list.stream().mapToLong(Long::longValue).toArray();

        return answer;
    }
}
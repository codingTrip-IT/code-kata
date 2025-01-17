import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        Set<Integer> allNumbers = new HashSet<>();
        for (int i = 0; i <= 9; i++) {
            allNumbers.add(i);
        }

        for (int num : numbers) {
            allNumbers.remove(num);
        }

        answer = allNumbers.stream().mapToInt(Integer::intValue).sum();
        return answer;
    }
}
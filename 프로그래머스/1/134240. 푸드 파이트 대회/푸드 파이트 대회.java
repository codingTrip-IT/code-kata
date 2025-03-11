import java.util.*;

class Solution {
        public String solution(int[] food) {
            String answer = "";
            List<Integer> numbers = new ArrayList<>();
            for (int i = 1; i < food.length; i++) {
                if (food[i]/2 < 1){
                    continue;
                }
                for (int j = 0; j < food[i]/2; j++) {
                    numbers.add(i);
                }
            }

            for (int i = numbers.size()-1; i >= 0; i--) {
                numbers.add(numbers.get(i));
            }

            numbers.add(numbers.size()/2, 0);

            StringBuilder sb = new StringBuilder();
            for (Integer number : numbers) {
                sb.append(number);
            }
            answer = sb.toString();
            return answer;
        }
}
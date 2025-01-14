import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
            List<Integer> answerList = new ArrayList<>();

            for (int i=0; i<arr.length;i++) {
                if(arr[i] % divisor == 0){
                    answerList.add(arr[i]);
                }
            }

            if (answerList.isEmpty()){
                return new int[]{-1};
            }

            answer = new int[answerList.size()];

            for (int i=0; i<answer.length;i++) {
                answer[i] = answerList.get(i);
            }

            Arrays.sort(answer);

            return answer;
    }
}
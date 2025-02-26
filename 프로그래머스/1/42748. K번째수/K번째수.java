import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            List<Integer> answerList = new ArrayList<>();
            List<Integer> answerList2 = new ArrayList<>();
            
            for (int i = 0; i < commands.length; i++) {
                int start = commands[i][0]-1;
                int end = commands[i][1];
                int k = commands[i][2]-1;
                System.out.println("start = " + start);
                System.out.println("end = " + end);
                System.out.println("k = " + k);

                for (int j = start; j < end; j++) {
                    answerList.add(array[j]);
                    answerList2.add(array[j]);
                }
                Collections.sort(answerList);
                answer[i] = answerList.get(k);
                System.out.println("answerList = " + answerList);
                System.out.println("answer[i] = " + answer[i]);

                answerList.removeAll(answerList2);
            }

            return answer;
    }
}
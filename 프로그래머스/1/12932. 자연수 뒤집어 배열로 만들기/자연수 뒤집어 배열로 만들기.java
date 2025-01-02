import java.util.*;
    
class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int n2 = (int)Math.log10(n)+1;
        int b = (int)n;
        for (int j = 1; j <= n2; j++) {
            list.add(b%10);
            b/=10;
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();
        // int i = 0;
        
        // for(int i=0;i<n2;i++){
        //     answer[i] = b%10;
        //     b/=10;
        // }
        // while(i<n2){
        //     answer[i] = b%10;
        //     b/=10;
        //     i++;
        // }
        return answer;
    }
}
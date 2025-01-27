import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        s.chars() 
            .boxed() 
            .sorted(Comparator.reverseOrder())
            .forEach(i -> answer.append((char)(int)i)); 

        return answer.toString();
    }
}
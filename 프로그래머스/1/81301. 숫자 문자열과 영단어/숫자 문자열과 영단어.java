import java.util.*;

class Solution {
    public int solution(String s) {
        Map<String, Integer> numMap = new HashMap<>();

            numMap.put("zero", 0);
            numMap.put("one", 1);
            numMap.put("two", 2);
            numMap.put("three", 3);
            numMap.put("four", 4);
            numMap.put("five", 5);
            numMap.put("six", 6);
            numMap.put("seven", 7);
            numMap.put("eight", 8);
            numMap.put("nine", 9);
            
            List<String> list = new ArrayList<>();
            list.add("zero");
            list.add("one");
            list.add("two");
            list.add("three");
            list.add("four");
            list.add("five");
            list.add("six");
            list.add("seven");
            list.add("eight");
            list.add("nine");

            for (String str : list) {
                for (String key : numMap.keySet()) {
                    String value = String.valueOf(numMap.get(key));
                    if (str.equals(key)) {
                        s = s.replace(key, value);
                    }
                }
            }
            return Integer.parseInt(s);
    }
}
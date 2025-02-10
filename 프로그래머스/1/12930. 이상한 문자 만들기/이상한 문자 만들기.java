class Solution {
    public String solution(String s) {
        String answer = "";
        String[] splitStr = s.split(" ", -1);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < splitStr.length; i++) {
            String str = splitStr[i];
            StringBuilder builder = new StringBuilder();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                builder.append((j % 2 == 0) ? Character.toUpperCase(c) : Character.toLowerCase(c));
            }

            result.append(builder);
            if (i < splitStr.length - 1) {
                result.append(" ");
            }
        }
        answer = result.toString();
        return answer;
    }
}
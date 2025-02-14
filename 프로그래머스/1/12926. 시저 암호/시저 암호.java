class Solution {
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if ((c>=65 && c<=90) || (c>=97 && c<=122)){
                    if ((c<=90)){
                        if (c+n>90){
                            c = (char) (c+n-26);
                        } else {
                            c = (char) (c + n);
                        }
                    }

                    if ((c>=97)){
                        if (c+n>122){
                            c = (char) (c+n-26);
                        } else {
                            c = (char) (c + n);
                        }
                    }


                    chars[i] = c;
                }
            }
            return String.valueOf(chars);
    }
}
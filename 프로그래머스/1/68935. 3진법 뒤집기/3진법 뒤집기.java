class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

            while(n>0){
                sb.append(n%3);
                n/=3;
            }

            String reversed = new StringBuilder(sb).reverse().toString();
            System.out.println("reversed = " + reversed);
            int three = 1;

            for (int i = 0; i < reversed.length(); i++) {
                answer += Character.getNumericValue(reversed.charAt(i)) * three;
                three*=3;
            }

        return answer;
    }
}
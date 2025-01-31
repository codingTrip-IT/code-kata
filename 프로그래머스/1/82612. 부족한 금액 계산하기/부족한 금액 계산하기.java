class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        for (int i = 1; i <= count ; i++) {
            total += (long)price * i;
        }

        if(money < total){
            answer = total-money;
        } else {
            answer = 0;
        }
        

        return answer;
    }
}
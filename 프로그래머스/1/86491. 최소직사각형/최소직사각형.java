class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
         int weight = 0;
        int height = 0;
        int maxWeight= 0;
        int maxHeight = 0;

        for (int i = 0; i < sizes.length ; i++) {
            weight = sizes[i][0];
            height = sizes[i][1];

            if (weight < height) {
                sizes[i][0] = height;
                sizes[i][1] = weight;
            }

            if (maxWeight < sizes[i][0]){
                maxWeight = sizes[i][0];
            }

            if (maxHeight < sizes[i][1]){
                maxHeight = sizes[i][1];
            }
        }
        answer = maxWeight * maxHeight;
        return answer;
    }
}
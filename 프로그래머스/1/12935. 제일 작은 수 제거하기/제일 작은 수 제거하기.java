import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
         // 배열 길이가 1이면 {-1} 반환
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 배열에서 최소값 찾기
        int min = Arrays.stream(arr).min().getAsInt();

        // 최소값을 제외한 새로운 배열 생성
        return Arrays.stream(arr)
                .filter(value -> value != min)
                .toArray();
    }
}
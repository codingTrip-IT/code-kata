import java.util.*;
class Solution {
          public String[] solution(String[] strings, int n) {
            String[] answer = {};

            List<Sort> sortList = new ArrayList<>();

            for (String s : strings) {
                sortList.add(new Sort(s,s.charAt(n)));
            }

            Collections.sort(sortList, new SortNumComparator());
            System.out.println("sortList = " + sortList);

            // 정렬된 리스트에서 문자열만 추출하여 배열로 변환
            answer = sortList.stream().map(s -> s.str).toArray(String[]::new);
            return answer;
        }

        class SortNumComparator implements Comparator<Sort>{
            @Override
            public int compare(Sort o1, Sort o2) {
                // num 비교
                int numCompare = Integer.compare(o1.num, o2.num);
                if (numCompare != 0) {
                    return numCompare;
                }
                // num이 같다면 str 기준으로 정렬
                return o1.str.compareTo(o2.str);
            }
        }

        class SortStrComparator implements Comparator<Sort>{
            @Override
            public int compare(Sort o1, Sort o2) {
                return o1.str.compareTo(o2.str);
            }
        }

        class Sort {
            private String str;
            private int num;

            public Sort(String str, int num) {
                this.str = str;
                this.num = num;
            }

            @Override
            public String toString() {
                return "[ " + this.str + ": " + this.num + " ]";
            }
        }

}
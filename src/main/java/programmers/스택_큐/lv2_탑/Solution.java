package programmers.스택_큐.lv2_탑;


import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] a = {3, 9, 9, 3, 5, 7, 2};
//        System.out.println(solution(a)); // 결과 [0,0,0,3,3,3,6]
        for (int i : solution(a)) {

            System.out.print(":"+i);
        }


    }

    private static int[] solution(int[] heights) {
        int[] answer = heights.clone();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < heights.length; i++) {
            list.add(i, heights[i]);
        }

        /*for (Integer integer : list) {
            System.out.println(integer + ":");
        }*/

        for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = i-1;  j>= 0; j--) {
                if (list.get(j) > list.get(i)) {
                    answer[i] = j+1;
                    break;
                }
                answer[i] = 0;
            }
        }
        answer[0] = 0;

        return answer;
    }
}

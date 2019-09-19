package programmers.스택_큐.lv2_탑;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution2 {
    public static void main(String[] args) {
        int[] a = {3, 9, 9, 3, 5, 7, 2};
//        System.out.println(solution(a)); // 결과 [0,0,0,3,3,3,6]
        for (int i : solution(a)) {

            System.out.print(":" + i);
        }


    }

    private static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Stack<Integer> stack = new Stack<>();

        for (Integer integer : heights) {
            stack.push(integer);
        }


//{3, 9, 9, 3, 5, 7, 2};
//[0, 0, 0, 3, 3, 3, 6]
        int idx = heights.length;

        while (idx >= 0) {
            idx--;
            for (int i = idx; i >= 0; i--) {
                if (heights[i] > stack.peek()) {
                    answer[idx] = i + 1;
                    stack.pop();
                    break;
                }
                if (i == 0) {
                    answer[idx] = 0;
                    stack.pop();
                }
            }
        }
        return answer;
    }
}

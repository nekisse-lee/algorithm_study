package programmers.정렬.lv3_h_index;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution2 {
    public static void main(String[] args) {
        int[] aa = {1, 1, 9, 1, 1, 1};  // 0 : 5
//        int[] aa = {2, 1, 3, 2}; //2   : 1
//        System.out.println(solution(aa, 2));
        System.out.println("정답 : "+solution(aa, 0));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 1;

        PriorityQueue priority = new PriorityQueue<>(Collections.reverseOrder());

        for (int task : priorities) {
            priority.add(task);
            System.out.println(priority);
        }
        //{2,5,4,1,3};

        System.out.println("priority = " + priority);


        while (!priority.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == (int) priority.peek()) {
                    if (i == location) {
                        return answer;
                    }
                    priority.poll();
                    answer++;
                }
            }
        }
        return answer;
    }
}

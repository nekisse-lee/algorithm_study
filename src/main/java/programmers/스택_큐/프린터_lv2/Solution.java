package programmers.스택_큐.프린터_lv2;

import java.util.*;

@SuppressWarnings("ALL")
public class Solution {
    public static void main(String[] args) {
//        int[] aa ={2,5,4,1,3};
//        int[] aa ={2, 1, 3, 2};
        int[] aa = {1, 1, 9, 1, 1, 1};
        System.out.println(solution(aa, 0));

    }

    public static int solution(int[] priorities, int location) {
        int answer = 1;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int task : priorities)
            priorityQueue.add(task);

        while(!priorityQueue.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                if(priorities[i] == priorityQueue.peek()) {
//                    System.out.println("priorityQueue.peek() = " + priorityQueue.peek());
                    if(i == location) {
                        return answer;
                    }
                    priorityQueue.poll();
                    answer++;
                }
            }
        }
        return answer;    }
}

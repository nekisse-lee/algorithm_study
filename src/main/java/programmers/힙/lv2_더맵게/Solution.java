package programmers.힙.lv2_더맵게;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;

        System.out.println("solution(scoville,k) = " + solution(scoville, k));//2
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i : scoville) {
            queue.add(i);
        }
        System.out.println("queue = " + queue);


        while (queue.peek() < K) {
            if (queue.size() == 1) {
                return -1;
            }
            queue.add(queue.poll() + (queue.poll() * 2));
            answer++;
        }

        System.out.println("queue = " + queue);

        return answer;

    }
}
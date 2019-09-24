package programmers.힙.lv2_라면공장;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int stock = 4;
        int[] dates = {4, 6, 15};
        int[] supplies = {6, 9, 10};
        int k = 29;
        System.out.println(solution(stock, dates, supplies, k));        //2


    }

    private static int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        int count = 0;
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        while (stock < k) {
            while (count < dates.length && dates[count] <= stock) {
                queue.add(supplies[count]);
                count++;
            }

                stock += queue.poll();
                answer++;

        }
        return answer;
    }
}

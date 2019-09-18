package programmers.완전탐색.모의고사_lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

//        int[] answer = {1, 2, 3, 4, 5};[]
        int[] answer = {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(solution(answer)));
    }


    private static int[] solution(int[] answers) {
        int[] answer = {0, 0, 0};

        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == supo1[i % supo1.length]) {
                answer[0]++;
            }
            if (answers[i] == supo2[i % supo2.length]) {
                answer[1]++;
            }
            if (answers[i] == supo3[i % supo3.length]) {
                answer[2]++;
            }
        }


        int max = Math.max(answer[0], Math.max(answer[1], answer[2]));
        List<Integer> winner = new ArrayList<>();

        for (int i = 0; i < answer.length; i++) {
            if (max == answer[i]) {
                winner.add(i + 1);
            }
        }
        int[] ints = winner.stream().mapToInt(value -> value).toArray();
//        System.out.println("ints = " + Arrays.toString(ints));
        return ints;
    }
}
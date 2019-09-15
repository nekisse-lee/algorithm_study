package programmers.정렬.k번째수;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] aa = {1, 5, 2, 6, 3, 7, 4};
        int[][] bb = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        solution(aa, bb);
    }

    private static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

//        for (int i : array) {
//            System.out.print(i + ":");
//        }
//        System.out.println();


        for (int i = 0; i < commands.length; i++) {
            int[] newArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(newArray);
//            for (int s : newArray) {
//                System.out.print("newarr: " + s +"\t");
//            }
            answer[i] = newArray[commands[i][2]-1];
//            System.out.println();
        }
//        for (int i : answer) {
//            System.out.println("i = " + i);
//        }
        return answer;
    }
}

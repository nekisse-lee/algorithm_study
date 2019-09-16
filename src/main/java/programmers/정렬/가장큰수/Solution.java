package programmers.정렬.가장큰수;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        int[] arr = {3, 30, 34, 5, 9};
        int[] arr = {0};

        System.out.println(solution(arr));

    }


    private static String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr, (o1, o2) -> {
            return (o2 + o1).compareTo(o1 + o2);
        });

        if (arr[0].equals("0")) {
            return "0";
        }

        for (int i = 0; i < arr.length; i++) {
            answer.append(arr[i]);
        }

//        for (String s : arr) {
//            System.out.println("s = " + s);
//
//        }

        return answer.toString();
    }
}
package programmers.정렬.lv3_h_index;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
//        int[] aa = {3, 0, 6, 1, 5};
//        int[] aa = {5,3,2,4,3};
//        int[] aa = {4,4,3};
//        int[] aa = {4,4,6,6};

//        int[] aa = {4,4,4,4,5,7,8,8,8,8,8,8,8};
//        int[] aa = {1,1,1,1,1,1,1, 1, 2, 3, 10};
        int[] aa = {1, 7, 0, 1, 6, 4};

        System.out.println("aa.length = " + aa.length);
        System.out.println();
        System.out.println("\n ==: " + solution(aa));



    }

    private static int solution(int[] citations) {
        int answer = 0;

        List<Integer> ll = new ArrayList<>();
        for (int citation : citations) {
            ll.add(citation);
        }
        Collections.sort(ll);
        Collections.reverse(ll);

//        for (Integer integer : ll) {
//            System.out.print(":" + integer);
//        }
//        System.out.println();

        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + ":");
            if (ll.get(i) <= i+1) {
                answer = i;
                break;
            }
        }
        return answer+1;
    }
}

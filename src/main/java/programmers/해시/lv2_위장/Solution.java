package programmers.해시.lv2_위장;

import java.util.*;

@SuppressWarnings("DuplicatedCode")
public class Solution {
    public static void main(String[] args) {
        String[][] close = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println("solution : " + solution(close));

    }

    private static int solution(String[][] clothes) {
        /*System.out.println("answer = " + clothes[1][1].length() + " : " + clothes[1][1].toString());
        System.out.println(clothes[1].length);
        System.out.println(clothes[2].length);
        System.out.println(clothes[0].toString().length());
        System.out.println(Arrays.toString(clothes[0]));
        System.out.println(clothes[1][0]);*/
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            int i1 = clothes[i].length - 1;
            map.put(clothes[i][i1], map.getOrDefault(clothes[i][i1], 0) + 1);
        }
        Collection<Integer> values = map.values();
//        int size = values.size();
        for (Integer value : values) {
            answer *= (value + 1);
        }

        return answer - 1;
    }

}

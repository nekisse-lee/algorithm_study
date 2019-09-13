package programmers.해시.전화번호목록;


import java.util.*;

public class PhoneBook2Hash {

    public static void main(String[] args) {
        String[] str = {"12", "123", "1235", "567", "88"};
        solution(str);

    }

    private static boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int index = 0; index < phone_book.length; index++) {
            for (int jdx = 1; jdx < phone_book[index].length(); jdx++) {
                map.put(phone_book[index].substring(0, jdx), 1);
            }
        }

        for (int index = 0; index < phone_book.length; index++) {
            if (map.containsKey(phone_book[index])) {
                System.out.println("phone_book[index] = " + phone_book[index]);
                answer = false;
                break;
            } else {
                map.put(phone_book[index], 1);
            }
        }
        for (String s : map.keySet()) {
            System.out.println(s);
//            Collection<Integer> values = map.values();
//            for (Integer value : values) {
//                System.out.println("value = " + value);
//            }
        }

        return answer;
    }
}

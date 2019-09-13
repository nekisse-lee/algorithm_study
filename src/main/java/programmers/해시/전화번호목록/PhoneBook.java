package programmers.해시.전화번호목록;

import java.util.Arrays;

public class PhoneBook {

    public static void main(String[] args) {
//        String[] str = {"12", "123", "1235", "567", "88"};
        String[] str = {"119", "97674223", "1195524421"};
        System.out.println(solution(str));


    }

    private static boolean solution(String[] phone_book) {
        boolean answer = true;


        for (int i = 0; i < phone_book.length-1; i++) {
            for (int j = i+1; j < phone_book.length; j++) {
                if (phone_book[j].startsWith(phone_book[i])) {
                    return false;
                }
            }
        }


//        String[] sortString = new String[phone_book.length];
//
//        for (int i = 0; i < phone_book.length; i++) {
//            for (String s : phone_book) {
//                if (phone_book[i].length() >= s.length()) {
//                    sortString[i] = phone_book[i];
//                    answer = false;
//                    break;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(sortString));

        return answer;
    }


}

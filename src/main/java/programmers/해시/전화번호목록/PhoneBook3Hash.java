package programmers.해시.전화번호목록;


import java.util.*;

@SuppressWarnings("DuplicatedCode")
public class PhoneBook3Hash {

    public static void main(String[] args) {
        String[] str = {"119", "97674223", "1195524421"};
        solution(str);

    }

    private static boolean solution(String[] phone_book) {
        boolean answer = true;

        HashSet<String> set = new HashSet<>();
        Collections.addAll(set, phone_book);


        for (int index = 0; index < phone_book.length; index++) {
            if (set.contains(phone_book[index])) {
                System.out.println("phone_book[index] = " + phone_book[index]);
                answer = false;
                break;
            } else {
                set.add(phone_book[index]);
            }
        }

        
        

        /*for (String string : set) {
            System.out.println(string);
            for (String s : phone_book) {
                if (s.startsWith(string) && !s.equals(string)) {
                    answer = false;
                    break;
                }
            }
        }*/
/*        for (int i = 0; i < phone_book.length; i++) {
            if (iterator.hasNext()) {
                if (phone_book[i].startsWith(iterator.next()) && phone_book[i].equals(iterator.next())) {
                    answer = false;
                    break;
                }
            }
        }*/

//
//        for (int i = 0; i < phone_book.length; i++) {
//            if (map.containsKey(phone_book[i])) {
//                System.out.println("phone_book[index] = " + phone_book[i]);
//                answer = false;
//                break;
//            } else {
//                map.put(phone_book[i], 1);
//            }
//        }


        return answer;
    }
}

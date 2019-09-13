package programmers.해시.전화번호목록;


import java.util.*;

@SuppressWarnings("DuplicatedCode")
public class PhoneBook3HashSet {

    public static void main(String[] args) {
        String[] str = {"119", "97674223", "1195524421"};
        String[] str2 = {"123", "456", "789"};
        String[] str3 = {"12", "123", "1235", "567", "88"};
        System.out.println(solution(str));
        System.out.println(solution(str2));
        System.out.println(solution(str3));

    }

    private static boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set, phone_book);


        for (String value : phone_book) {
            for (String s : set) {
                if (!s.equals(value) && value.startsWith(s))
                    return answer = false;
            }
        }
        return answer;
    }
}

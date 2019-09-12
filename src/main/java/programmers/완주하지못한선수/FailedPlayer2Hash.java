package programmers.완주하지못한선수;

import java.util.HashMap;

public class FailedPlayer2Hash {
    public static void main(String[] args) {
//        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = {"josipa", "filipa", "marina", "nikola"};
//        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] participant = {"mislav", "stanko", "stanko", "ana"};
//        String[] completion = {"stanko", "ana", "mislav"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant, completion));
    }
    private static String solution(String[] participant, String[] completion) {
        String answer = "";

        /*Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for ( i = 0; i < completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                return participant[i];
            }
        }

        return participant[i];*/


        HashMap<String, Integer> map = new HashMap<>();
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }
        for (String s : map.keySet()) {
            if (map.get(s) != 0) {
                return answer = s;
            }
        }

        return answer;
    }
}

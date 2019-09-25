package programmers.힙.lv3_디스크컨트롤러;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
//        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        int[][] jobs = {{2, 3}, {3, 9}, {4, 6}};

        System.out.println(solution(jobs));

    }

    public static int solution(int[][] jobs) {
        int answer = 0;

        Queue<D> dQueue = new PriorityQueue<>(Collections.reverseOrder((o1, o2) -> o2.workingTime - o1.workingTime));

//        int initStartPoint = jobs[0][0];
//
//        if (jobs[0][0] != 0) {
//            for (int i = 0; i < jobs.length; i++) {
//                jobs[i][0] = jobs[i][0] - initStartPoint;
//            }
//        }

//        int initstartPoint = 0;
//        for (int[] ints : jobs) {
//            initstartPoint = ints[0];
//            break;
//        }

//        for (int i = 0; i < jobs.length; i++) {
//            jobs[i][0] = jobs[i][0] - initstartPoint;
//        }

//        System.out.println("jobs = " + Arrays.deepToString(jobs));
        for (int[] job : jobs) {
            dQueue.add(new D(job[0], job[1]));
        }
        System.out.println("dQueue = " + dQueue.toString());

        int time = 0;

        int sum = 0;
        while (dQueue.size() != 0) {
            for (int i = 0; i < dQueue.size(); i++) {

                if (time>=dQueue.peek().startIdx) {
                    D poll = dQueue.poll();
                    time += poll.workingTime;
                    sum += time - poll.startIdx;
                    break;
                }
                if (i == dQueue.size() - 1) {
                    time++;
                }

            }
        }

        answer = sum / jobs.length;
        return answer;
    }


}

@SuppressWarnings("ALL")
class D implements Comparable<D> {
    int startIdx;
    int workingTime;

    public D(int startIdx, int time) {
        this.startIdx = startIdx;
        this.workingTime = time;
    }

    @Override
    public int compareTo(D o) {
        if (this.workingTime < o.workingTime) {
            return -1;
        } else if (this.workingTime == o.workingTime) {
            if (this.startIdx < o.startIdx) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "D{" +
                "startIdx=" + startIdx +
                ", workingTime=" + workingTime +
                '}';
    }
}
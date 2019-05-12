import java.util.Scanner;

public class _2839 {
    public static void main(String args[]) {
        int count = 0;
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();

        while (true) {
            if (input <= 0) {
                System.out.println(-1);
                break;
            } else if (input % 5 == 0) {
                System.out.println(input / 5 + count);
                break;
            }
            input = input - 3;
            count++;
        }
    }
}
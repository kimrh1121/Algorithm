import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 수열 길이
        int[] sequence = new int[n];
        
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt(); // 만들고 싶은 수열 입력
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int current = 1; // 1부터 시작해서 push할 숫자
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int target = sequence[i];

            while (current <= target) {
                stack.push(current++);
                result.append("+\n");
            }

            if (stack.peek() == target) {
                stack.pop();
                result.append("-\n");
            } else {
                possible = false;
                break;
            }
        }

        if (possible) {
            System.out.print(result.toString());
        } else {
            System.out.println("NO");
        }
    }
}

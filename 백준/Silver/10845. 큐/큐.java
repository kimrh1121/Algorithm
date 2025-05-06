import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine()); // 줄 전체 읽기
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < num; i++) {
            String[] parts = scanner.nextLine().split(" ");
            String command = parts[0];

            if (command.equals("push")) {
                int value = Integer.parseInt(parts[1]);
                queue.add(value);
            } else if (command.equals("pop")) {
                System.out.println(queue.isEmpty() ? -1 : queue.poll());
            } else if (command.equals("size")) {
                System.out.println(queue.size());
            } else if (command.equals("empty")) {
                System.out.println(queue.isEmpty() ? 1 : 0);
            } else if (command.equals("front")) {
                System.out.println(queue.isEmpty() ? -1 : queue.peek());
            } else if (command.equals("back")) {
                System.out.println(queue.isEmpty() ? -1 : ((LinkedList<Integer>) queue).getLast());
            }
        }
    }
}

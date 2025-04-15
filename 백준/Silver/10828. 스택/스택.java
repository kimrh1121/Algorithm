import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stackInt = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            String command = br.readLine();

            switch (command) {
                case "pop":
                    sb.append(stackInt.isEmpty() ? -1 : stackInt.pop()).append("\n");
                    break;
                case "size":
                    sb.append(stackInt.size()).append("\n");
                    break;
                case "empty":
                    sb.append(stackInt.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "top":
                    sb.append(stackInt.isEmpty() ? -1 : stackInt.peek()).append("\n");
                    break;
                default: // push X
                    stackInt.push(Integer.parseInt(command.substring(5)));
                    break;
            }
        }

        System.out.print(sb.toString()); // Print once at the end
    }
}

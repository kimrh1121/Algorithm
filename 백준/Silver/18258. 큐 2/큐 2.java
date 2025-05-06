import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < num; i++) {
            String[] parts = br.readLine().split(" ");
            String command = parts[0];

            switch (command) {
                case "push":
                    queue.addLast(Integer.parseInt(parts[1]));
                    break;
                case "pop":
                    bw.write((queue.isEmpty() ? -1 : queue.pollFirst()) + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    bw.write((queue.isEmpty() ? 1 : 0) + "\n");
                    break;
                case "front":
                    bw.write((queue.isEmpty() ? -1 : queue.peekFirst()) + "\n");
                    break;
                case "back":
                    bw.write((queue.isEmpty() ? -1 : queue.peekLast()) + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
    }
}

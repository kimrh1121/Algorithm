import java.util.*;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
		for(int i = 0; i < num; i++) {
			int value = scanner.nextInt();
			if (value == 0) 
				sum -= stack.pop();
			else {
				stack.add(value);
				sum += value;
			}
		}
		System.out.println(sum);
		scanner.close();

	}

}

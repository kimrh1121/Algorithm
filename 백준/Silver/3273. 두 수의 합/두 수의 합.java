import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] number = new int[size];
		
		for (int i = 0; i < size; i++)
			number[i] = scanner.nextInt();
		
		int x = scanner.nextInt();
		HashSet<Integer> set = new HashSet<>();
		int count = 0;

		for (int i = 0; i < size; i++) {
			int target = x - number[i];
			if (set.contains(target)) {
				count++;
			}
			set.add(number[i]);
		}
		
		System.out.println(count);
		scanner.close();
	}
}
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int i = 1;
		
		while(num / i != 0) {
			i *= 2;
		}
        i /= 2;
		if (num == i)
			System.out.println(num);
		else
			System.out.println((num - i) * 2);
		scanner.close();
	}

}

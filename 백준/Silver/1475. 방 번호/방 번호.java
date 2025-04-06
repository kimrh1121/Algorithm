import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int count[] = new int[10];
		int max = 0;
		int i;
		
		for(i = 0; i < 10; i++) {
            count[i] = 0;
            int number2 = number;
            while(number2 != 0) {
                if (number2 % 10 == i)
                    count[i]++;
                number2 /= 10;
            }
            if (i == 6 || i == 9)
            	max = max > (count[6] + count[9] + 1) / 2 ? max : (count[6] + count[9] + 1) / 2;
            else
            	max = count[i] > max ? count[i] : max;
		}
		System.out.println(max);
        scanner.close();

	}

}

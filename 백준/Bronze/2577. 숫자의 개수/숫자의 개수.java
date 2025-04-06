import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int number = a * b * c;
        int count;
        

        for(int i = 0; i < 10; i++) {
            count = 0;
            int multiple = number;
            while(multiple != 0) {
                if (multiple % 10 == i)
                    count++;
                multiple /= 10;
            }
            System.out.println(count);
           }
        scanner.close();
    }
}
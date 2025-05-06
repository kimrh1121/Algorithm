import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String[] serials = new String[length];
        scanner.nextLine(); // 숫자 뒤에 남은 개행 제거

        for (int i = 0; i < length; i++) {
            serials[i] = scanner.nextLine();
        }

        Arrays.sort(serials, new Comparator<String>() {
            public int compare(String a, String b) {
                // 1. 길이 비교
                if (a.length() != b.length()) {
                    return a.length() - b.length();
                }

                // 2. 자리수 합 비교
                int sumA = sumOfDigits(a);
                int sumB = sumOfDigits(b);
                if (sumA != sumB) {
                    return sumA - sumB;
                }

                // 3. 사전 순 비교
                return a.compareTo(b);
            }

            private int sumOfDigits(String s) {
                int sum = 0;
                for (char c : s.toCharArray()) {
                    if (Character.isDigit(c)) {
                        sum += c - '0';
                    }
                }
                return sum;
            }
        });

        for (String s : serials) {
            System.out.println(s);
        }
    }
}

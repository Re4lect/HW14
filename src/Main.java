import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
       String number = String.valueOf(num);
       double sumOfNumbers = 0;
        for (int i = 0; i < number.length(); i++) {
            sumOfNumbers = sumOfNumbers + Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        return sumOfNumbers/number.length();
    }
}

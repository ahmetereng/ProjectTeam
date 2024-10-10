package programlama1.soru4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (String.valueOf(number).length() == 4) {
            int first = (int) Math.floor(number % 10000 * 10);
            int second = (int) Math.floor(number % 1000 * 10);
            int third = (int) Math.floor(number % 100 * 10);
            int fourth = (number % 10 * 10);
            int sum = first + second + third + fourth;
            int product = first * second * third * fourth;
            if (sum == product) {
                System.out.println("sum and product are equal");
            } else if (sum > product) {
                System.out.println("sum is greater than product");
            } else {
                System.out.println("product is greater than sum");
            }
        }
        input.close();
    }
}

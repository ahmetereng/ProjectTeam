package programlama1.soru4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String numberString = String.valueOf(number);
        if (String.valueOf(number).length() == 4) {
            String[] numberList = numberString.split("");
            int first = Integer.parseInt(numberList[0]);
            int second = Integer.parseInt(numberList[1]);
            int third = Integer.parseInt(numberList[2]);
            int fourth = Integer.parseInt(numberList[3]);
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
            System.out.println(fourth);

            int sum = first + second + third + fourth;
            int product = first * second * third * fourth;
            if (sum == product) {
                System.out.println("sum and product are equal");
            } else if (sum > product) {
                System.out.println("sum is greater than product");
            } else {
                System.out.println("product is greater than sum");
            }
        } else {
            System.out.println("You should enter a 4 digit number");
        }
        input.close();
    }
}

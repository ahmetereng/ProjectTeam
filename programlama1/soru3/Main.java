package programlama1.soru3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String numberString = String.valueOf(number);
        if (numberString.length() == 3) {
            String[] numberList = numberString.split("");
            int first = Integer.parseInt(numberList[0]);
            int second = Integer.parseInt(numberList[1]);
            int third = Integer.parseInt(numberList[2]);
            if (first < second) {
                int temp = first;
                first = second;
                second = temp;
            }
            if (second < third) {
                int temp = second;
                second = third;
                third = temp;
            }
            if (first < third) {
                int temp = first;
                first = third;
                third = temp;
            }
            System.out.println("" + first + second + third);
            System.out.println("" + third + second + first);
        } else {
            System.out.println("This is not a 3 digit Integer");
        }

        input.close();
    }
}

package programlama1.soru2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter a five digit number");
        Scanner input = new Scanner(System.in);
        int intNumber = input.nextInt();
        String number = intNumber + "";
        boolean isPalindrome = true;
        if (number.length() == 5) {
            for (int i = 0; i < number.length() / 2; i++) {
                if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
                    isPalindrome = false;
                }
            }
        }
        if (isPalindrome) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("its not palindrome");
        }
        input.close();
    }
}

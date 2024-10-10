package programlama1.soru1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write day, month, year");
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();
        int febDay = 28;
        if (checkLeapYear(year)) {
            febDay = 29;
        }
        int[] dayCount = { 31, febDay, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month > 0 && month <= 12) {
            if (dayCount[month - 1] >= day) {
                System.out.println("You have entered a valid date");
            }
        }
        input.close();
    }

    static boolean checkLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}

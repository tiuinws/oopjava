package praktikum1;

import java.util.Scanner;

public class praktikum1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String[] listDays = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};
        System.out.println("Please input a day code (1..7).");
        int inputCode = myScanner.nextInt();
        if (inputCode <= 7) {
            System.out.println("Your input is " + inputCode + " and the result is " + listDays[inputCode-1] + ".");
        } else {
            System.out.println("Error, invalid day code.");
        }
    }
}

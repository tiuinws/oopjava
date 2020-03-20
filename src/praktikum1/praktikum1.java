package praktikum1;

import java.util.Scanner;
import alfianLib.*;

public class praktikum1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        fn fun = new fn();
        String[] listDays = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};
        fn.outln("Please input a day code (1..7).");
        int inputCode = myScanner.nextInt();
        if (inputCode <= 7) {
            fn.outln("Your input is " + inputCode + " and the result is " + listDays[inputCode-1] + ".");
        } else {
            fn.outln("Error, invalid day code.");
        }
    }
}

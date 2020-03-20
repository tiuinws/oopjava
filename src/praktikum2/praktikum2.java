package praktikum2;

import java.util.Scanner;

import alfianLib.*;

public class praktikum2 {
    public static void main(String[] args) {
        doCalculate calc = new doCalculate();
        fn fun = new fn();
        fn.outln("Praktikum 2");
        calc.inputNumber();
        if (calc.isEven() && calc.isPositive()) {
            fn.outln(calc.number + " is even" + " and " + "is positive");
        } else if (calc.isEven() && !calc.isPositive()) {
            fn.outln(calc.number + " is even" + " and " + "is negative");
        } else if (!calc.isEven() && calc.isPositive()) {
            fn.outln(calc.number + " is odd" + " and " + "is positive");
        } else {
            fn.outln(calc.number + " is odd" + " and " + "is negative");
        }
    }
}

class doCalculate {
    int number;
    fn fun = new fn();

    int inputNumber() {
        Scanner myScanner = new Scanner(System.in);
        fn.outln("Input a number");
        number = myScanner.nextInt();
        return number;
    }

    boolean isEven() {
        return this.number % 2 == 0;
    }

    boolean isPositive() {
        return this.number > 0;
    }
}

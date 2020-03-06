package praktikum2;

import java.util.Scanner;

import alfianLib.*;

public class praktikum2 {
    public static void main(String[] args) {
        doCalculate calc = new doCalculate();
        funFunc fun = new funFunc();
        fun.outln("Praktikum 2");
        calc.inputNumber();
        if (calc.isEven() && calc.isPositive()) {
            fun.outln(calc.number + " is even" + " and " + "is positive");
        } else if (calc.isEven() && !calc.isPositive()) {
            fun.outln(calc.number + " is even" + " and " + "is negative");
        } else if (!calc.isEven() && calc.isPositive()) {
            fun.outln(calc.number + " is odd" + " and " + "is positive");
        } else {
            fun.outln(calc.number + " is odd" + " and " + "is negative");
        }
    }
}

class doCalculate {
    int number;
    funFunc fun = new funFunc();

    int inputNumber() {
        Scanner myScanner = new Scanner(System.in);
        fun.outln("Input a number");
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

package praktikum2;

import java.util.Scanner;

public class praktikum2 {
    public static void main(String[] args) {
        doCalculate calc = new doCalculate();
        System.out.println("Paktikum 2");
        calc.inputNumber();
        if (calc.isEven() && calc.isPositive()) {
            System.out.println(calc.number + " is even" + " and " + " is positive");
        } else if (calc.isEven() && !calc.isPositive()) {
            System.out.println(calc.number + " is even" + " and " + " is negative");
        } else if (!calc.isEven() && calc.isPositive()) {
            System.out.println(calc.number + " is odd" + " and " + " is positive");
        } else {
            System.out.println(calc.number + " is odd" + " and " + " is negative");
        }
    }
}

class doCalculate {
    int number;
    int inputNumber() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input a number");
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

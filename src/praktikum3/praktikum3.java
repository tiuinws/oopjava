package praktikum3;

/*
 * @startuml
 * testdot
 * @enduml
 */

import java.util.Scanner;

import alfianLib.*;

public class praktikum3 {
    public static void main(String[] args) {
        praktikum3Helper p3h = new praktikum3Helper(); // create new object with name p3h
        fn.outln("Praktikum 2"); // print with obj name fun
        int[] sequenceData = p3h.inputNumber(); // initilize sequenceData with p3h.inputnumber method
        int[] sequences = p3h.createSequence(sequenceData[0], sequenceData[1], sequenceData[2]); // init sequences
        fn.out(sequences); // print sequences
    }
}

class praktikum3Helper {
    int base, diff, range;

    int[] inputNumber() {
        Scanner myScanner = new Scanner(System.in);
        fn.outln("Input Base"); this.base = myScanner.nextInt();
        fn.outln("Input Diff"); this.diff = myScanner.nextInt();
        fn.outln("Input Range"); this.range = myScanner.nextInt();
        return new int[]{base, diff, range};
    }

    int[] createSequence(int base, int diff, int range) {
        int[] sequences = new int[range];
        sequences[0] = base;
        sequences[1] = diff;
        for (int i = 1; i < range; i++) {
            sequences[i] = sequences[i - 1] + diff;
        }
        return sequences;
    }
}

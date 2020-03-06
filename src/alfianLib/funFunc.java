package alfianLib;

import java.util.Scanner;

public class funFunc {

    /* Input */ Scanner scan = new Scanner(System.in);

    public String inStr() { return scan.next(); }

    public String inStr(String word) { this.out(word); return scan.next(); }

    public String inLn() { return scan.nextLine(); }

    public String inLn(String word) { this.out(word); return scan.nextLine(); }

    public int inInt() { return scan.nextInt(); }

    public int inInt(String word) { this.out(word); return scan.nextInt();}

    /* Output */
    public void out() { System.out.print(""); }

    public void out(char c) { System.out.print(c); }

    public void out(String s) { System.out.print(s); }

    public void out(int i) { System.out.print(i); }

    public void out(Double d) { System.out.print(d); }

    public void out(String[] arrStr) {
        for (String s : arrStr) {
            System.out.print(s + " ");
        } System.out.println();
    }

    public void out(int[] arrInt) {
        for (int i : arrInt) {
            System.out.print(i + " ");
        } System.out.println();
    }

    public void out(String[] arrStr, int[] arrInt) {
        int totalLength = arrStr.length + arrStr.length; for (int i = 0; i < totalLength; i++) {
            if (i < arrStr.length && i < arrInt.length) {
                System.out.print(arrStr[i] + " " + arrInt[i] + " ");
            }
        } System.out.println();
    }

    public void out(int[] arrInt, String[] arrStr) {
        int totalLength = arrStr.length + arrInt.length; for (int i = 0; i < totalLength; i++) {
            if (i < arrStr.length && i < arrInt.length) {
                System.out.print(arrInt[i] + " " + arrStr[i] + " ");
            }
        } System.out.println();
    }

    public void outln() { System.out.println(); }

    public void outln(String s) { System.out.println(s); }

    public void outln(int i) { System.out.println(i); }

    public void outln(Double d) { System.out.println(d); }

    public void outln(String[] arrStr) {
        for (String s : arrStr) {
            System.out.println(s);
        }
    }

    public void outln(int[] arrInt) {
        for (int i : arrInt) {
            System.out.println(i);
        }
    }

    public void outln(int[] arrInt, String[] arrStr) {
        int totalLength = arrStr.length + arrInt.length; for (int i = 0; i < totalLength; i++) {
            if (i < arrStr.length && i < arrInt.length) {
                System.out.println(arrInt[i] + " " + arrStr[i] + " ");
            }
        }
    }

    public void outln(String[] arrStr, int[] arrInt) {
        int totalLength = arrStr.length + arrInt.length; for (int i = 0; i < totalLength; i++) {
            if (i < arrStr.length && i < arrInt.length) {
                System.out.println(arrStr[i] + " " + arrInt[i] + " ");
            }
        }
    }
}

package alfianLib;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class fn extends mo {

    private static Scanner scan;
    /* Input */

    public static String inStr() { return scan.next(); }

    public static String inStr(String word) { out(word); return scan.next(); }

    public static String inLn() { return scan.nextLine(); }

    public static String inLn(String word) { out(word); return scan.nextLine(); }

    public static int inInt() { return scan.nextInt(); }

    public static int inInt(String word) { out(word); return scan.nextInt(); }

    public static BigInteger inBI() { return scan.nextBigInteger(); }

    public static BigInteger inBI(String word) { out(word); return scan.nextBigInteger(); }

    public static double inDbl() { return scan.nextDouble(); }

    public static double inDbl(String word) { out(word); return scan.nextDouble(); }

    public static long inLg() { return scan.nextLong(); }

    public static long inLg(String word) { out(word); return scan.nextLong(); }

    public static long inByte() { return scan.nextByte(); }

    public static long inByte(String word) { out(word); return scan.nextByte(); }

    public static BigDecimal inBD() { return scan.nextBigDecimal(); }

    public static BigDecimal inBD(String word) { out(word); return scan.nextBigDecimal(); }

    /* Output */
    public static void out() { System.out.print(""); }

    public static void out(char c) { System.out.print(c); }

    public static void out(String s) { System.out.print(s); }

    public static void out(int i) { System.out.print(i); }

    public static void out(Double d) { System.out.print(d); }

    public static void out(String[] arrStr) {
        for (String s : arrStr) {
            System.out.print(s + " ");
        } System.out.println();
    }

    public static void out(int[] arrInt) {
        for (int i : arrInt) {
            System.out.print(i + " ");
        } System.out.println();
    }

    public static void out(String[] arrStr, int[] arrInt) {
        int totalLength = arrStr.length + arrStr.length; for (int i = 0; i < totalLength; i++) {
            if (i < arrStr.length && i < arrInt.length) {
                System.out.print(arrStr[i] + " " + arrInt[i] + " ");
            }
        } System.out.println();
    }

    public static void out(int[] arrInt, String[] arrStr) {
        int totalLength = arrStr.length + arrInt.length; for (int i = 0; i < totalLength; i++) {
            if (i < arrStr.length && i < arrInt.length) {
                System.out.print(arrInt[i] + " " + arrStr[i] + " ");
            }
        } System.out.println();
    }

    public static void outln() { System.out.println(); }

    public static void outln(String s) { System.out.println(s); }

    public static void outln(int i) { System.out.println(i); }

    public static void outln(Double d) { System.out.println(d); }

    public static void outln(String[] arrStr) {
        for (String s : arrStr) {
            System.out.println(s);
        }
    }

    public static void outln(int[] arrInt) {
        for (int i : arrInt) {
            System.out.println(i);
        }
    }

    public static void outln(int[] arrInt, String[] arrStr) {
        int totalLength = arrStr.length + arrInt.length; for (int i = 0; i < totalLength; i++) {
            if (i < arrStr.length && i < arrInt.length) {
                System.out.println(arrInt[i] + " " + arrStr[i] + " ");
            }
        }
    }

    public static void outln(String[] arrStr, int[] arrInt) {
        int totalLength = arrStr.length + arrInt.length; for (int i = 0; i < totalLength; i++) {
            if (i < arrStr.length && i < arrInt.length) {
                System.out.println(arrStr[i] + " " + arrInt[i] + " ");
            }
        }
    }
}

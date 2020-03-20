package alfianLib;

public class mo {

    protected static double pi = 3.14159265359;
    static int[] oneToTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static String[] aToZ = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                            "S", "T", "U", "V", "W", "X", "Y", "Z"};
    static String[] dayNamesEn = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    static String[] dayNamesId = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};
    static String[] monthNamesEn = {"January", "February", "March", "April", "May", "June", "July", "August",
                                    "September", "October", "November", "Desember"};
    static String[] monthNamesId = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus",
                                    "September", "November", "Desember"};
    static int dayTotal = 7;
    static int monthTotal = 12;
    static int dayOneWeek = 7;
    static int dayOneMonth = 30;
    static int dayOneYear = 365;

    // get

    public static int head(int[] arrInt) { return arrInt[0]; }

    public static String head(String[] arrStr) { return arrStr[0]; }

    public static int[] tail(int[] arrInt) {
        int[] newArrInt = new int[arrInt.length - 1];
        System.arraycopy(arrInt, 1, newArrInt, 0, newArrInt.length);
        return newArrInt;
    }

    public static String[] tail(String[] arrStr) {
        String[] newArrStr = new String[arrStr.length - 1];
        System.arraycopy(arrStr, 1, newArrStr, 0, newArrStr.length);
        return newArrStr;
    }

    // basic arithmetic
    public static int sum(int x, int y) { return x + y; }

    public static double sum(double x, double y) { return x + y; }

    public static int doubleSum(int x, int y) { return sum(x, y) + sum(x, y); }

    public static int tripleSum(int x, int y) { return doubleSum(x, y) + sum(x, y); }

    public static int sub(int x, int y) { return x - y; }

    public static double sub(double x, double y) { return x - y; }

    public static int mul(int x, int y) { return x * y; }

    public static double mul(double x, double y) { return x * y; }

    public static double mul(int x, double y) { return x * y; }

    public static double mul(double x, int y) { return x * y; }

    public static int div(int x, int y) { return x / y; }

    public static double div(int x, double y) { return x / y; }

    public static double div(double x, int y) { return x / y; }

    public static double div(double x, double y) { return x / y; }

    public static int mod(int x, int y) { return x % y; }

    public static double pct(int a, int percent) { return div(mul(a, percent), 100); }

    public static double pct(double a, double percent) { return div(mul(a, percent), 100); }

    // calc shape
    public static double triangle(int x, int y) { return mul(x, y) >> 1; }

    public static double triangle(double x, double y) { return mul(x, y) / 2; }

    public static double triangle(int x, double y) { return div(mul(x, y), 2); }

    public static double triangle(double x, int y) { return div(mul(x, y), 2); }

    // calc Time
    public static int decade() { return 10; }

    public static int decade(int x) { return 10 * x; }

    public static void decadeOut(String p, String s) { fn.out(p); decade(); fn.out(s); }

}

package alfianLib;

public class mathOps {
    funFunc fun = new funFunc();
    double pi = 3.14159265359;
    int[] oneToTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    String[] aToZ = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    String[] dayNamesEn = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    String[] dayNamesId = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};
    String[] monthNamesEn = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "Desember"};
    String[] monthNamesId = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "November", "Desember"};
    int dayTotal = 7;
    int monthTotal = 12;
    int dayOneWeek = 7;
    int dayOneMonth = 30;
    int dayOneYear = 365;

    // get

    public int head(int[] arrInt) { return arrInt[0]; }

    public String head(String[] arrStr) { return arrStr[0]; }

    public int[] tail(int[] arrInt) {
        int[] newArrInt = new int[arrInt.length - 1]; for (int i = 0; i < newArrInt.length; i++) {
            if (i < newArrInt.length) {
                newArrInt[i] = arrInt[i + 1];
            }
        } ; return newArrInt;
    }

    public String[] tail(String[] arrStr) {
        String[] newArrStr = new String[arrStr.length - 1]; for (int i = 0; i < newArrStr.length; i++) {
            if (i < newArrStr.length) {
                newArrStr[i] = arrStr[i + 1];
            }
        } ; return newArrStr;
    }

    // basic arithmetic
    public int sum(int x, int y) { return x + y; }

    public double sum(double x, double y) { return x + y; }

    public int doubleSum(int x, int y) { return sum(x, y) + sum(x, y); }

    public int tripleSum(int x, int y) { return doubleSum(x, y) + sum(x, y); }

    public int sub(int x, int y) { return x - y; }

    public double sub(double x, double y) { return x - y; }

    public int mul(int x, int y) { return x * y; }

    public double mul(double x, double y) { return x * y; }

    public double mul(int x, double y) { return x * y; }

    public double mul(double x, int y) { return x * y; }

    public int div(int x, int y) { return x / y; }

    public double div(int x, double y) { return x / y; }

    public double div(double x, int y) { return x / y; }

    public double div(double x, double y) { return x / y; }

    public int mod(int x, int y) { return x % y; }

    public double pct(int a, int percent) { return div(mul(a, percent), 100); }

    public double pct(double a, double percent) { return div(mul(a, percent), 100); }

    // calc shape
    public double triangle(int x, int y) { return mul(x, y) >> 1; }

    public double triangle(double x, double y) { return mul(x, y) / 2; }

    public double triangle(int x, double y) { return div(mul(x, y), 2); }

    public double triangle(double x, int y) { return div(mul(x, y), 2); }

    // calc Time
    public int decade() { return 10; }
    public void decadeOut(String p, String s) { fun.out(p); this.decade(); fun.out(s); }

}

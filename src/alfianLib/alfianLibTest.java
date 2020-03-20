package alfianLib;

public class alfianLibTest {
    public static void main(String[] args) {
        /*
        mathOps math = new mathOps();
        funFunc fun = new funFunc();
        fun.outln(math.pi);
        fun.outln("" + math.sum(5, 4));
        fun.outln("LOL");
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        fun.out(nums);
        fun.outln(" " + " " + nums + nums);
        fun.outln("Hello" + " " + "World");
        String[] days = {"senin", "selasa", "rabu", "kamis", "jum'at", "sabtu", "minggu"};
        fun.out(days);
        fun.outln(days, nums);
        fun.outln(nums, days);
        int range = 10;
        int[] fib = new int[range];
        fib[0] = 2;
        fib[1] = 3;
        for (int i = 2; i < range; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < range; i++) {
            fun.outln(fib[i]);
        }
        fun.outln(math.pi);
        fun.out(math.oneToTen);
        fun.out(math.aToZ);
        fun.outln(math.tripleSum(1, 2));
        fun.outln(math.triangle(4.0, 4.5));
        fun.outln(math.head(math.oneToTen));
        fun.outln(math.head(math.aToZ));
        fun.out(math.tail(math.oneToTen));
        fun.out(math.tail(math.aToZ));
        String firstMonth = math.head(math.monthNamesId);
        fun.outln(firstMonth);
        fun.outln(math.pct(100,5));
        */
        fn.outln(fn.pi);
        fn.outln(mo.pct(50,2));
        privateClass pc = new privateClass();
        pc.greet();
    }

    private static class privateClass {
        void greet() {
            fn.out("Hello World from private class");
        }
    }
}

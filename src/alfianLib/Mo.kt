package alfianLib

object Mo {
    internal var pi = 3.14159265359
    var oneToTen = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var aToZ = arrayOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
            "S", "T", "U", "V", "W", "X", "Y", "Z")
    var dayNamesEn = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    var dayNamesId = arrayOf("Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu")
    var monthNamesEn = arrayOf("January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "Desember")
    var monthNamesId = arrayOf("Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus",
            "September", "November", "Desember")
    var dayTotal = 7
    var monthTotal = 12
    var dayOneWeek = 7
    var dayOneMonth = 30
    var dayOneYear = 365
    // get
    fun head(arrInt: IntArray): Int {
        return arrInt[0]
    }

    fun head(arrStr: Array<String?>): String? {
        return arrStr[0]
    }

    fun tail(arrInt: IntArray): IntArray {
        val newArrInt = IntArray(arrInt.size - 1)
        System.arraycopy(arrInt, 1, newArrInt, 0, newArrInt.size)
        return newArrInt
    }

    fun tail(arrStr: Array<String?>): Array<String?> {
        val newArrStr = arrayOfNulls<String>(arrStr.size - 1)
        System.arraycopy(arrStr, 1, newArrStr, 0, newArrStr.size)
        return newArrStr
    }

    // basic arithmetic
    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    fun sum(x: Double, y: Double): Double {
        return x + y
    }

    fun doubleSum(x: Int, y: Int): Int {
        return sum(x, y) + sum(x, y)
    }

    fun tripleSum(x: Int, y: Int): Int {
        return doubleSum(x, y) + sum(x, y)
    }

    fun sub(x: Int, y: Int): Int {
        return x - y
    }

    fun sub(x: Double, y: Double): Double {
        return x - y
    }

    fun mul(x: Int, y: Int): Int {
        return x * y
    }

    fun mul(x: Double, y: Double): Double {
        return x * y
    }

    fun mul(x: Int, y: Double): Double {
        return x * y
    }

    fun mul(x: Double, y: Int): Double {
        return x * y
    }

    fun div(x: Int, y: Int): Int {
        return x / y
    }

    fun div(x: Int, y: Double): Double {
        return x / y
    }

    fun div(x: Double, y: Int): Double {
        return x / y
    }

    fun div(x: Double, y: Double): Double {
        return x / y
    }

    fun mod(x: Int, y: Int): Int {
        return x % y
    }

    fun pct(a: Int, percent: Int): Double {
        return div(mul(a, percent), 100).toDouble()
    }

    fun pct(a: Double, percent: Double): Double {
        return div(mul(a, percent), 100)
    }

    // calc shape
    fun triangle(x: Int, y: Int): Double {
        return (mul(x, y) shr 1).toDouble()
    }

    fun triangle(x: Double, y: Double): Double {
        return mul(x, y) / 2
    }

    fun triangle(x: Int, y: Double): Double {
        return div(mul(x, y), 2)
    }

    fun triangle(x: Double, y: Int): Double {
        return div(mul(x, y), 2)
    }

    // calc Time
    fun decade(): Int {
        return 10
    }

    fun decade(x: Int): Int {
        return 10 * x
    }

    fun decadeOut(p: String?, s: String?) {
        fn.out(p)
        decade()
        fn.out(s)
    }
}
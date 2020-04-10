package alfianLib

import java.math.BigDecimal
import java.math.BigInteger
import java.util.*

object Fn : mo() {
    private val scan: Scanner? = null
    /* Input */
    fun inStr(): String {
        return scan!!.next()
    }

    fun inStr(word: String?): String {
        out(word)
        return scan!!.next()
    }

    fun inLn(): String {
        return scan!!.nextLine()
    }

    fun inLn(word: String?): String {
        out(word)
        return scan!!.nextLine()
    }

    fun inInt(): Int {
        return scan!!.nextInt()
    }

    fun inInt(word: String?): Int {
        out(word)
        return scan!!.nextInt()
    }

    fun inBI(): BigInteger {
        return scan!!.nextBigInteger()
    }

    fun inBI(word: String?): BigInteger {
        out(word)
        return scan!!.nextBigInteger()
    }

    fun inDbl(): Double {
        return scan!!.nextDouble()
    }

    fun inDbl(word: String?): Double {
        out(word)
        return scan!!.nextDouble()
    }

    fun inLg(): Long {
        return scan!!.nextLong()
    }

    fun inLg(word: String?): Long {
        out(word)
        return scan!!.nextLong()
    }

    fun inByte(): Long {
        return scan!!.nextByte().toLong()
    }

    fun inByte(word: String?): Long {
        out(word)
        return scan!!.nextByte().toLong()
    }

    fun inBD(): BigDecimal {
        return scan!!.nextBigDecimal()
    }

    fun inBD(word: String?): BigDecimal {
        out(word)
        return scan!!.nextBigDecimal()
    }

    /* Output */
    fun out() {
        print("")
    }

    fun out(c: Char) {
        print(c)
    }

    fun out(s: String?) {
        print(s)
    }

    fun out(i: Int) {
        print(i)
    }

    fun out(d: Double?) {
        print(d)
    }

    fun out(arrStr: Array<String>) {
        for (s in arrStr) {
            print("$s ")
        }
        println()
    }

    fun out(arrInt: IntArray) {
        for (i in arrInt) {
            print("$i ")
        }
        println()
    }

    fun out(arrStr: Array<String>, arrInt: IntArray) {
        val totalLength = arrStr.size + arrStr.size
        for (i in 0 until totalLength) {
            if (i < arrStr.size && i < arrInt.size) {
                print(arrStr[i] + " " + arrInt[i] + " ")
            }
        }
        println()
    }

    fun out(arrInt: IntArray, arrStr: Array<String>) {
        val totalLength = arrStr.size + arrInt.size
        for (i in 0 until totalLength) {
            if (i < arrStr.size && i < arrInt.size) {
                print(arrInt[i].toString() + " " + arrStr[i] + " ")
            }
        }
        println()
    }

    fun outln() {
        println()
    }

    fun outln(s: String?) {
        println(s)
    }

    fun outln(i: Int) {
        println(i)
    }

    fun outln(d: Double?) {
        println(d)
    }

    fun outln(arrStr: Array<String?>) {
        for (s in arrStr) {
            println(s)
        }
    }

    fun outln(arrInt: IntArray) {
        for (i in arrInt) {
            println(i)
        }
    }

    fun outln(arrInt: IntArray, arrStr: Array<String>) {
        val totalLength = arrStr.size + arrInt.size
        for (i in 0 until totalLength) {
            if (i < arrStr.size && i < arrInt.size) {
                println(arrInt[i].toString() + " " + arrStr[i] + " ")
            }
        }
    }

    fun outln(arrStr: Array<String>, arrInt: IntArray) {
        val totalLength = arrStr.size + arrInt.size
        for (i in 0 until totalLength) {
            if (i < arrStr.size && i < arrInt.size) {
                println(arrStr[i] + " " + arrInt[i] + " ")
            }
        }
    }
}
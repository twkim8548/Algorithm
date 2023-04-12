import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val number = br.readLine()
    number.forEach {
        when(it) {
            '0' -> {
                bw.write("0000\n" +
                            "0  0\n" +
                            "0  0\n" +
                            "0  0\n" +
                            "0000\n")
            }
            '1' -> {
                bw.write("   1\n" +
                        "   1\n" +
                        "   1\n" +
                        "   1\n" +
                        "   1\n")
            }
            '2' -> {
                bw.write("2222\n" +
                        "   2\n" +
                        "2222\n" +
                        "2\n" +
                        "2222\n")
            }
            '3' -> {
                bw.write("3333\n" +
                        "   3\n" +
                        "3333\n" +
                        "   3\n" +
                        "3333\n")
            }
            '4' -> {
                bw.write("4  4\n" +
                        "4  4\n" +
                        "4444\n" +
                        "   4\n" +
                        "   4\n")
            }
            '5' -> {
                bw.write("5555\n" +
                        "5\n" +
                        "5555\n" +
                        "   5\n" +
                        "5555\n")
            }
            '6' -> {
                bw.write("6666\n" +
                        "6\n" +
                        "6666\n" +
                        "6  6\n" +
                        "6666\n")
            }
            '7' -> {
                bw.write("7777\n" +
                        "   7\n" +
                        "   7\n" +
                        "   7\n" +
                        "   7\n")
            }
            '8' -> {
                bw.write("8888\n" +
                        "8  8\n" +
                        "8888\n" +
                        "8  8\n" +
                        "8888\n")
            }
            '9' -> {
                bw.write("9999\n" +
                        "9  9\n" +
                        "9999\n" +
                        "   9\n" +
                        "   9\n")
            }
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}
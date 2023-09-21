import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.math.BigInteger
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    repeat(n) {
        repeat(n * 5) {
            bw.write("@")
        }
        bw.write("\n")
    }

    repeat(n) {
        repeat(n) {
            bw.write("@")
        }
        bw.write("\n")
    }

    repeat(n) {
        repeat(n * 5) {
            bw.write("@")
        }
        bw.write("\n")
    }

    repeat(n * 2) {
        repeat(n) {
            bw.write("@")
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}
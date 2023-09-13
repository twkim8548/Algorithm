import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    repeat(n) {
        val num = it + 1

        if (num % 11 == 0 && num % 7 == 0) {
            bw.write("Wiwat!\n")
        } else if (num % 7 == 0) {
            bw.write("Hurra!\n")
        } else if (num % 11 == 0) {
            bw.write("Super!\n")
        } else {
            bw.write("$num\n")
        }
    }

    bw.flush()
    bw.close()
}
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

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        var ans = 0

        for (i in 1 .. n) {
            if (i % 2 > 0) {
                ans += i
            }
        }
        bw.write("$ans\n")
    }

    bw.flush()
    bw.close()
}
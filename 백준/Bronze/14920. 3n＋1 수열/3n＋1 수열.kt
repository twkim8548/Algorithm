import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()
    var cnt = 1
    while (n > 1) {
        cnt++
        if (n % 2 == 0) {
            n /= 2
        } else {
            n = 3 * n + 1
        }
    }

    bw.write("$cnt")

    bw.flush()
    bw.close()
}
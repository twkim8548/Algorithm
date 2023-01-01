import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.abs
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val b = br.readLine().toInt()
    val p = 5 * b - 400
    bw.write("${p}\n")

    if (p < 100) {
        bw.write("1")
    } else if (p > 100) {
        bw.write("-1")
    } else {
        bw.write("0")
    }

    bw.flush()
    br.close()
}

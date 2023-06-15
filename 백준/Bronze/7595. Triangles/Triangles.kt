import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val n = br.readLine().toInt()
        if (n == 0) {
            break
        }
        repeat(n) {
            repeat(it + 1) {
                bw.write("*")
            }
            bw.write("\n")
        }
    }

    bw.flush()
    bw.close()
}
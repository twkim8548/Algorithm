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

    val n = br.readLine().toInt()

    if (n%2 == 1) {
        bw.write("0")
    } else {
        if ((n/2)%2 ==1) {
            bw.write("1")
        } else {
            bw.write("2")
        }
    }

    bw.flush()
    bw.close()
}
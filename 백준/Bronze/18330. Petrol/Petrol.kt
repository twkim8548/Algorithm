import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val k = br.readLine().toInt()

    if (k + 60 > n) {
        bw.write("${n * 1500}")
    } else {
        bw.write("${((k + 60) * 1500 )+ ((n - k - 60) * 3000)}")
    }

    bw.flush()
    bw.close()
}
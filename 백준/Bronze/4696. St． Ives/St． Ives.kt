import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while(true) {
        val n = br.readLine().toDouble()
        if (n == 0.0) {
            break
        }
        bw.write("${String.format("%.2f", 1 + n + n*n + n*n*n + n*n*n*n)}\n")

    }


    bw.flush()
    bw.close()
}
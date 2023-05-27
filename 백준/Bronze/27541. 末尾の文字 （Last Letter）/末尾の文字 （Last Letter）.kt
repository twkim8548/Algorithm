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
    val s = br.readLine()

    if (s[n-1] == 'G') {
        bw.write(s.substring(0, n-1))
    } else {
        bw.write(s + 'G')
    }
    bw.flush()
    bw.close()
}
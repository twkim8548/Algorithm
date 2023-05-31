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
        if (n == -1.0) {
            break
        }
        bw.write("Objects weighing ${String.format("%.2f",n)} on Earth will weigh ${String.format("%.2f",n*0.167)} on the moon.\n")
    }

    bw.flush()
    bw.close()
}
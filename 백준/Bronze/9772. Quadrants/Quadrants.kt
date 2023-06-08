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
        val token = StringTokenizer(br.readLine())
        val x = token.nextToken().toDouble()
        val y = token.nextToken().toDouble()

        if (x == 0.0 || y == 0.0) {
            bw.write("AXIS\n")
        } else if (x > 0 && y > 0) {
            bw.write("Q1\n")
        } else if (x < 0 && y > 0) {
            bw.write("Q2\n")
        } else if (x < 0 && y < 0) {
            bw.write("Q3\n")
        } else {
            bw.write("Q4\n")
        }

        if (x == 0.0 && y == 0.0) {
            break
        }
    }

    bw.flush()
    bw.close()
}
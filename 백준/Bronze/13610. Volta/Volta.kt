import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()

    var cnt = 1

    while (true) {
        if (b * cnt - a * cnt >= b) {
            break
        }
        cnt++
    }

    bw.write("$cnt")

    bw.flush()
    bw.close()
}

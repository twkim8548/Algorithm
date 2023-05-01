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

    val token = StringTokenizer(br.readLine())

    val a = token.nextToken().toInt()
    val d = token.nextToken().toInt()
    val k = token.nextToken().toInt()

    if ((k - a) % d != 0 || (k - a) / d < 0) {
        bw.write("X")
    } else {
        bw.write("${((k - a) / d) + 1}")
    }

    bw.flush()
    bw.close()
}
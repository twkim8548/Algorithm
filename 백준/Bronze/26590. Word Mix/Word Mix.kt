import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val a = token.nextToken()
    val b = token.nextToken()

    for (i in 0 until min(a.length, b.length)) {
        if (i % 2 == 0) {
            bw.write("${a[i]}")
        } else {
            bw.write("${b[i]}")
        }
    }

    bw.flush()
    bw.close()
}
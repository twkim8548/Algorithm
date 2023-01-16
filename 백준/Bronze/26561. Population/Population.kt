import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())

        var p = token.nextToken().toInt()
        val k = token.nextToken().toInt()

        p -= k / 7
        p += k / 4
        bw.write("$p\n")
    }

    bw.flush()
    bw.close()
}

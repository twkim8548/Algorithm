import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.time.OffsetDateTime
import java.util.StringTokenizer
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    var n = token.nextToken().toInt()
    val m = token.nextToken().toInt()
    var answer = n

    while (n >= m) {
        n /= m
        answer += n
    }

    bw.write("$answer")

    bw.flush()
    bw.close()
}
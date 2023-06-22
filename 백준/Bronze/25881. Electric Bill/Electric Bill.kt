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
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    repeat(br.readLine().toInt()) {
        var j = br.readLine().toInt()
        var k = j
        var answer = 0
        if (k > 1000) {
            answer += 1000 * n
            k -= 1000
            answer += k * m
        } else {
            answer += k * n
        }
        bw.write("$j $answer\n")
    }


    bw.flush()
    bw.close()
}
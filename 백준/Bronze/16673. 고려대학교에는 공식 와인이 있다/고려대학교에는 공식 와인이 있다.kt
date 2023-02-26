import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val c = token.nextToken().toInt()
    val k = token.nextToken().toInt()
    val p = token.nextToken().toInt()

    var answer = 0

    repeat(c) {
        val cnt = it + 1
        val wine = k * cnt + p * cnt.toDouble().pow(2.0)
        answer += wine.toInt()
    }

    bw.write("$answer")

    bw.flush()
    br.close()
}

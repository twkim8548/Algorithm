import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

        var answer  = ""
    for (i in 0 until n) {
        answer += n.toString()
    }
    if (answer.length> m) {
        bw.write(answer.substring(0, m))
    } else {
        bw.write(answer)
    }

    bw.flush()
    bw.close()
}

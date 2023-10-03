import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.io.Writer
import java.math.BigInteger
import java.util.StringTokenizer
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()

    token = StringTokenizer(br.readLine())
    val k = token.nextToken().toInt()
    val x = token.nextToken().toInt()

    var answer = 0

    for (i in a..b) {
        if (Math.abs(i - k) <= x) {
            answer++
        }
    }

    if (answer == 0) {
        bw.write("IMPOSSIBLE")
    } else {
        bw.write("$answer")
    }

    bw.flush()
    br.close()
}
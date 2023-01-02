import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var token = StringTokenizer(br.readLine())
    val array = IntArray(n) { token.nextToken().toInt() }

    token = StringTokenizer(br.readLine())
    val x = token.nextToken().toInt()
    val y = token.nextToken().toInt()

    bw.write("${n * x / 100}")
    var answer = 0
    array.forEach {
        if (it >= y) {
            answer++
        }
    }

    bw.write(" $answer")

    bw.flush()
    bw.close()
}

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
    val token = StringTokenizer(br.readLine())
    val array = Array<BigInteger>(n) {token.nextToken().toBigInteger()}

    var answer = BigInteger.ZERO
    array.forEach {
        if (it.toString() == it.toString().reversed()) {
            answer += it
        }
    }
    bw.write("$answer")

    bw.flush()
    bw.close()
}

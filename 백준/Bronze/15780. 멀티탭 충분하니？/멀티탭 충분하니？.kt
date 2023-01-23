import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()

    token = StringTokenizer(br.readLine())
    val array = IntArray(k) {token.nextToken().toInt()}

    var cnt = 0
    array.forEach {
        cnt += Math.ceil((it/2.0)).toInt()
    }

    if (cnt >= n) bw.write("YES")
    else bw.write("NO")

    bw.flush()
    bw.close()
}

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
import kotlin.math.ceil
import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    token = StringTokenizer(br.readLine())
    val array = IntArray(n) {token.nextToken().toInt()}

    token = StringTokenizer(br.readLine())
    val array2 = IntArray(m) {token.nextToken().toInt()}

    bw.write("${array.max() + array2.max()}")

    bw.flush()
    bw.close()
}

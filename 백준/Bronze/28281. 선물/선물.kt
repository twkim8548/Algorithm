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
    val n = token.nextToken().toInt()
    val x = token.nextToken().toInt()

    token = StringTokenizer(br.readLine())
    val array = IntArray(n) {token.nextToken().toInt()}
    val price = IntArray(n-1)

    for (i in 0 until n - 1) {
        price[i] = array[i] * x + array[i + 1] * x
    }
    bw.write("${price.min()}")

    bw.flush()
    br.close()
}
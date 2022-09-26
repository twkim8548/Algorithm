import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*
import kotlin.math.pow


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        bw.write("${dolmen(token.nextToken().toInt(), token.nextToken().toInt())}\n")
    }

    bw.flush()
    br.close()
}

fun dolmen(a: Int, b: Int): BigInteger {
    var sum = BigInteger.ZERO
    val result = (a + b).toDouble().pow(2.0).toBigDecimal().toBigInteger()
    sum += result * (a.toBigInteger() + b.toBigInteger() - BigInteger.ONE) / "2".toBigInteger()
    return sum
}
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

    while(true) {
        val token = StringTokenizer(br.readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        if (a == 0 && b == 0) {
            break
        }

        if (a > b && a % b == 0) {
            bw.write("multiple\n")
        } else if (a < b && b % a == 0) {
            bw.write("factor\n")
        } else {
            bw.write("neither\n")
        }
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
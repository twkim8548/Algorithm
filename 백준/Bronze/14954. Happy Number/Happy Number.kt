import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toBigInteger()
    var num = BigInteger.ZERO
    n.toString().forEach {
        num += it.toString().toBigInteger() * it.toString().toBigInteger()
    }
    n = num
    while (n.toString().length > 1) {
        var num = BigInteger.ZERO
        n.toString().forEach {
            num += it.toString().toBigInteger() * it.toString().toBigInteger()
        }
        n = num
    }

    if (n == BigInteger.ONE) {
        bw.write("HAPPY")
    } else {
        bw.write("UNHAPPY")
    }

    bw.flush()
    bw.close()
}

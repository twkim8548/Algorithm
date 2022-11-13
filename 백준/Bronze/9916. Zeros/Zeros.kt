import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = factorial(br.readLine().toBigInteger(), BigInteger.ONE)

    var answer = 0
    n.toString().forEach {
        if (it == '0') {
            answer++
        }
    }
    bw.write("$answer")

    bw.flush()
    br.close()
}

fun factorial(n: BigInteger, acc: BigInteger): BigInteger {
    return if (n <= BigInteger.ZERO) {
        acc
    } else {
        factorial(n- BigInteger.ONE, n*acc)
    }
}
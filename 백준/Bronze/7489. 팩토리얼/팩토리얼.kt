import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val fac = factorial(n, BigInteger.ONE).toString().reversed()
        var cnt = 0
        while (true) {
            if (fac[cnt] != '0') {
                bw.write("${fac[cnt]}\n")
                break
            }
            cnt++
        }
    }

    bw.flush()
    bw.close()
}

fun factorial(n: Int, acc: BigInteger): BigInteger {
    return if (n <= 0) {
        acc
    } else {
        factorial(n - 1, n.toBigInteger() * acc)
    }
}

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while(true) {
        var n = br.readLine().toBigInteger()
        if (n == BigInteger.ZERO) {
            break
        }

        while (n.toString().length > 1) {
            var sum = BigInteger.ZERO
            n.toString().forEach {
                sum += it.toString().toBigInteger()
            }
            n = sum
        }

        bw.write("$n\n")
    }

    bw.flush()
    bw.close()
}
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toBigInteger()
        if (n % BigInteger.valueOf(2) == BigInteger.valueOf(0) ) {
            bw.write("even\n")
        } else {
            bw.write("odd\n")
        }
    }

    bw.flush()
    bw.close()
}
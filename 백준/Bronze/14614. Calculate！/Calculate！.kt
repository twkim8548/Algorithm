import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    val c = token.nextToken().toBigInteger()

    if (c % BigInteger.valueOf(2) == BigInteger.valueOf(0)) {
        bw.write("$a")
    } else {
        bw.write("${a xor (b)}")
    }

    bw.flush()
    bw.close()
}

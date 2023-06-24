import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.time.OffsetDateTime
import java.util.StringTokenizer
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val a = token.nextToken().toBigInteger()
    val b = token.nextToken().toBigInteger()

    if (a % "2".toBigInteger() == BigInteger.ZERO || b % "2".toBigInteger() == BigInteger.ZERO) {
        bw.write("0")
    } else {

    if (a > b) {
        bw.write("$b")
    } else {
        bw.write("$a")
    }
    }

    bw.flush()
    bw.close()
}
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()

    var answer = BigInteger.ONE
    for (i in a .. b) {
        var sum = BigInteger.ZERO
        for (j in 1 .. i) {
            sum += j.toBigInteger()
        }
        answer *= sum
    }
    bw.write("${answer % "14579".toBigInteger()}")

    bw.flush()
    bw.close()
}
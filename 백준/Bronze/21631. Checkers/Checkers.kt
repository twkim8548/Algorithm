import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))


    var token = StringTokenizer(br.readLine())
    val x = token.nextToken().toBigInteger()
    val y = token.nextToken().toBigInteger()

    if (x>=y) {
        bw.write("$y")
    } else {
    bw.write("${x + BigInteger.ONE}")
    }

    bw.flush()
    br.close()
}

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import java.math.BigInteger

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val token = StringTokenizer(br.readLine())

    bw.write("${token.nextToken().toBigInteger() + token.nextToken().toBigInteger() + token.nextToken().toBigInteger()}")
    bw.flush()
    bw.close()
    br.close()
}

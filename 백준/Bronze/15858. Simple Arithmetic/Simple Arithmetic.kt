import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val a = token.nextToken().toBigDecimal()
    val b = token.nextToken().toBigDecimal()
    val c = token.nextToken().toBigDecimal()

    bw.write("${a * b / c}")

    bw.flush()
    bw.close()
}
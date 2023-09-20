import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.math.BigInteger
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var sum = 0.0
    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        sum += token.nextToken().toDouble() * token.nextToken().toDouble()
    }
    bw.write("${sum}")

    bw.flush()
    bw.close()
}